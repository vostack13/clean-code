import java.util.ArrayList;

class VariableNaming {
  public VariableNaming() {}

  int f1(int a1, ArrayList<Integer> a2) {
    int a5 = 0;

    for (int a3 = 0; a3 < a2.size() && a3 < a1; a3++) {
      int a6 = a2.get(a3);

      if (a6 >= 0) {
        System.out.println(a6 + " ");
      } else {
        a5++;
      }
    }

    System.out.println("\n");
    return a5;
  }

  void printFirstNPositive(int countFirstNumbers, ArrayList<Integer> collection)
  {
    for (int i = 0; i < collection.size() && i < countFirstNumbers; i++) {
      int maybePositive = collection.get(i);

      if (maybePositive >= 0) {
        System.out.println(maybePositive + " ");
      }
    }
    System.out.println("\n");
  }
}

// f1 — printFirstNPositive
// функция вывода на экран n первых положительных чисел из коллекции

// a1 -> countFirstNumbers
// количество первых чисел

// a2 - collection
// колекция чисел

// a6 - maybePositive
// число для проверки на положительное значение

