class Solution {
    
     class Data {
        int idx;
        int arrHash;

        public Data(int idx, int hash) {
            this.idx = idx;
            this.arrHash = hash;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return idx == data.idx && arrHash == data.arrHash;
        }

        @Override
        public int hashCode() {
            return Objects.hash(idx, arrHash);
        }
    }

    HashMap<Data, Integer> dp = new HashMap<>();


    public int maxHappyGroups(int batchSize, int[] groups) {
        int[] arr = new int[batchSize];
        for (int group : groups) {
            arr[group % batchSize]++;
        }
        return arr[0]+solve(0, arr);
    }

    private int solve(int num, int[] arr) {
        if (isFull(arr)) {
            return 0;
        }
        Data key = new Data(num, Arrays.hashCode(arr));
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int best = Integer.MIN_VALUE / 2;
        if (num == 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= 0) {
                    continue;
                }
                arr[i]--;
                best = Math.max(best, 1 + solve(i, arr));
                arr[i]++;
            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > 0) {
                    int[] newFreq = Arrays.copyOf(arr, arr.length);
                    arr[i]--;
                    best = Math.max(best, solve((num + i) % arr.length, arr));
                    arr[i]++;
                }

            }
        }
        dp.put(key, best);
        return best;
    }

    private boolean isFull(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum == 0;
    }
}