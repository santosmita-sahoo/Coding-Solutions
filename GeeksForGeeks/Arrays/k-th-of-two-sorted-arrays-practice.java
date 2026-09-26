
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans = a[i];
                i++;
            } else {
                ans = b[j];
                j++;
            }

            count++;

            if (count == k) {
                return ans;
            }
        }

        while (i < a.length) {
            ans = a[i];
            i++;
            count++;

            if (count == k) {
                return ans;
            }
        }

        while (j < b.length) {
            ans = b[j];
            j++;
            count++;

            if (count == k) {
                return ans;
            }
        }

        return ans;
    }
}