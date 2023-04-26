// 3.1. Улучшите пять имён классов в вашем коде.

// было
class MessageInfo {}

// стало
class MessageMeta {}


// было
class DataManager {}

// стало
class Employee {}


// было
class MessagesSend {}

// стало
class MessagesSender {}


// было
class PrepareProduct {}

// стало
class EnrichedProduct {}

// было
class PivotClass {}

// стало
class Pivot {}

// 3.2. Улучшите семь имён методов и объектов по схеме из пункта 2.


// было
class Account {
  Fetch fetchItem () {}

  void deleteItem () {}

  void preparedUTCDate () {}

  void setSignature () {}

  void deleteSignature () {}

  void changeMeta (AccountMeta meta) {}

  void setInitialAmount () {}
}

// стало
class Account {
  Fetch getItem () {}

  void removeItem () {}

  void getUTCDate () {}

  void addSignature() {}

  void removeSignature () {}

  void updateMeta (AccountMeta meta) {}

  void resetAmount () {}
}