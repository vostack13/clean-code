import java.util.ArrayList;

// 6.1 Выбирайте имена на подходящем уровне абстракции

// 1. loadProviders -> load
// 2. data -> providersRawData
// 3. password -> generatePassword
// 4. salt -> secretSalt
// 5. pass -> unencryptedPassword
// 6. getPassword -> encrypt

// Плохо
class Providers {
  ArrayList<String> loadProviders () {
    ArrayList<String> data = new ArrayList<>();

    // some code
    return data;
  }

  String password (String salt, String pass) {
    return this.getPassword(salt, pass);
  }
}

// Хорошо
class Providers {
  ArrayList<String> load () {
    ArrayList<String> providersRawData = new ArrayList<>();

    // some code 
    return providersRawData;
  }

  String generatePassword (String secretSalt, String unencryptedPassword) {
    return this.encrypt(secretSalt, unencryptedPassword);
  }
}

// 6.2. Приведите четыре примера, где вы в качестве имён переменных использовали или могли бы использовать технические термины из информатики.

// 1. AccountService -> AccountFactory
// 2. createAccount -> AccountEntity
// 3. accounts -> accountsList
// 4. allowedFields -> allowedFieldsList

// Плохо
class AccountService {
  public Account createAccount (Account type) {
    ArrayList<String> accounts = new ArrayList<>();
    ArrayList<String> allowedFields = new ArrayList<>();
  }
}

// Хорошо
class AccountFactory {
  public AccountEntity createAccountEntity (AccountEntity type) {
    ArrayList<String> accountsList = new ArrayList<>();
    ArrayList<String> allowedFieldsList = new ArrayList<>();
  }
}

// 6.3. Придумайте или найдите в своём коде три примера, когда имена переменных даны с учётом контекста (функции, метода, класса).

// 1. productId -> id
// 2. productData -> data
// 3. clearDataProduct -> clearData
// 4. enrichmentDataProduct -> enrichmentData
// 5. data -> productData

// Плохо
class Product {
  String productId;
  ProductData productData;

  void clearDataProduct () {}

  void enrichmentDataProduct () {
    ProductData data = new ProductData();
  }
}

// Хорошо
class Product {
  String id;
  ProductData data;

  void clearData () {}

  void enrichmentData () {
    ProductData productData = new ProductData();
  }
}

// 6.4. Найдите пять имён переменных в своём коде, длины которых не укладываются в 8-20 символов, и исправьте, чтобы они укладывались в данный диапазон.

// 1. f1 -> getFirstNPositive
// 2. a1 -> countFirstNumbers
// 3. a2 -> collection
// 4. a5 -> firstNPositive
// 5. a6 -> maybePositive

// Плохо
int f1(int a1, ArrayList<Integer> a2) {
  int a5 = 0;

  for (int a3 = 0; a3 < a2.size() && a3 < a1; a3++) {
    int a6 = a2.get(a3);

    if (a6 < 0) {
      a5++;
    }
  }

  return a5;
}

// Хорошо
void getFirstNPositive(int countFirstNumbers, ArrayList<Integer> collection) {
  int firstNPositive = 0;

  for (int i = 0; i < collection.size() && i < countFirstNumbers; i++) {
    int maybePositive = collection.get(i);

    if (maybePositive < 0) {
      firstNPositive++;
    }
  }

  return firstNPositive;
}