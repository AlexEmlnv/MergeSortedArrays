# MergeSortedArrays
Даны два отсортированных массива.
Вам нужно написать метод, который берет элементы этих массивов и добавляет в третий массив.
Третий массив должен получится тоже отсортированный.
Например:
Массив 1                    int[] a = new int[] {1, 3};
Массив 2                    int[] b = new int[] {2, 4};
Массив результат, который появится после слияния.
int[] result = new int[] {1, 2, 3, 4};
В задаче нельзя использовать сортировку.

Суть решение.
Так как оба массива отсортированы по возрастанию, то минимальный элемент всегда будет первым.
Смысл решения сводиться к сравнению первых элементов массива. Полученный элемент мы вставляем в третий массив. Далее операция сравнения повторяется, но сравнение уже идет с первый элементов и нулевым. 
Вам нужно сделать два индекса, которые указывает на текущий элемент. При выборе минимального элемента указатель сдвигается на один элемент вперед.
Здесь нужно использовать цикл while.