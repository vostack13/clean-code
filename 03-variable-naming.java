// 7.1. Приведите пять примеров правильного именования булевых переменных в вашем коде в формате "было - стало".

// было

void enrichmentAddressList() {
  try {
    // some code

    this.addressesPrepared = true;
    this.addressesPreparedError = false;
  } catch (Exception e) {
    this.addressesPreparedError = true;
  }
}

Appeal updateAppeal() {
  boolean isNotFoundAppeal = false;
  // some code

  if (isNotFoundAppeal) {
    return null;
  }

  //
}

void preparedMessages() {
  boolean newMeta = false;

  for (int i = 0; i < this.list.count) {
    newMeta = checkNewMeta(this.list[i])

    if (newMeta) {
      // some code
    }
  }
}

boolean success = false;

// стало

void enrichmentAddressList() {
  try {
    // some code

    this.enrichmentComplete = true;
    this.enrichmentError = false;
  } catch (Exception e) {
    this.enrichmentError = true;
  }
}

Appeal updateAppeal() {
  boolean found = false;
  // some code

  if (found) {
    // some code
  }

  return null;
}

void preparedMessages() {
  boolean isNewMessage = false;

  for (int i = 0; i < this.list.count; i++) {
    isNewMessage = checkNewMeta(this.list[i])

    if (isNewMessage) {
      // some code
    }
  }
}


// 7.2. Найдите несколько подходящих случаев, когда в вашем коде можно использовать типичные имена булевых переменных.

try {
  TicketService ticketService = new TicketService();
  this.currentTicket = ticketService.load();
  this.error = false;
  this.success = true;
} catch (Exception e) {
  this.error = true;
  this.success = false;
}

// 7.3. Проверьте, правильно ли вы даёте имена индексам циклов. Попробуйте найти случай, когда вместо i j k нагляднее использовать более выразительное имя.

void sendAppeals() {
  for (int numberAppeals = 1; numberAppeals < this.sendingLimit; numberAppeals++) {
    // some code
  }
}

// 7.4. Попробуйте найти в своих решениях два-три случая, когда можно использовать пары имён - антонимы.

class Location {

void success() {}
void failure() {}

void send() {
  boolean loadind = false;
  boolean loaded = false;

  try {
    loadind = true;

   // some code

    loaded = true;
    this.success();
  } catch() {
    // some code
    this.faulure();
  }

  loadind = false;
}
}


// 7.5. Всем ли временным переменным в вашем коде присвоены выразительные имена? Найдите несколько случаев, когда временные переменные надо переименовать, и поищите, возможно, от некоторых временных переменных вам получится вообще полностью избавиться.

// было

void migrateTicket() {
  MetaInfo temp = null;

  for(int i = 0; i < this.list.count; i++) {
    Ticket tempTicket = this.list.get(i);

    temp = getMetainfo(tempTicket);
    this.upgradeMetainfo(temp);
    tempTicket.meta = temp;
  }
}

// стало

void migrateTicket() {
  MetaInfo oldMeta = null;

  for(int i = 0; i < this.list.count; i++) {
    Ticket ticket = this.list.get(i);

    oldMeta = getMetainfo(tempTicket);
    this.upgradeMetainfo(oldMeta);
    ticket.meta = oldMeta;
  }
}