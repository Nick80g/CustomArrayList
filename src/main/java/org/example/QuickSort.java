package org.example;





    public class QuickSort<T extends Comparable<T>> {

        /**
         * Метод быстрой сортировки.
         */
        public  CustomArrayList<T> quickSort(CustomArrayList<T> list) {
            if (list.getSize() == 0){
                return list;
            }
            CustomArrayList<T> sorted;
            CustomArrayList<T> smaller = new CustomArrayList<T>() {
            };
            CustomArrayList<T> greater = new CustomArrayList<>();
            T pivot = list.get(0);
            T j;
            for (int i = 1; i < list.getSize(); i++) {
                j = list.get(i);
                if (j.compareTo(pivot) < 0)
                    smaller.add(j);
                else
                    greater.add(j);
            }
            smaller = quickSort(smaller);
            greater = quickSort(greater);
            smaller.add(pivot);
            for (int i = 0; i < greater.getSize(); i++) {
                smaller.add(greater.get(i));
            }
            sorted = smaller;
            return sorted;
        }

    }

