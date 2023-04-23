// было

CountryCode[] getPersonalCountiesCodes(String id) {
  CountryCode[] codesCountries = this.findPersonalCounties(this.countriesCodes, id);

  return codesCountries;
}

// стало

CountryCode[] getPersonalCountiesCodes(String id) {
  CountryCode[] codes = this.findPersonalCounties(this.countriesCodes, id);

  return codes;
}

// было

void addAdderss(String addressString) {
  this.person.address = addressString;
}

// стало

void addAdderss(Person person, String address) {
  person.address = address;
}

// было

String[] getMessagesTitles() {
  return this.messagesList.getTitles();
}

// стало

String[] getMessagesTitles() {
  return this.messages.getTitles();
}

// было

void checkFileSizes(int fileSize) {
  int maxFileSize = 10 - this.convertToFileSize(20);
  int maxSizeAllFiles = 50 - this.convertToFileSize(20);
}

// стало

void checkFileSizes(int fileSizeKb) {
  int maxFileSizeMb = 10 - this.convertKbToMb(20);
  int maxSizeAllFilesMb = 50 - this.convertKbToMb(20);
}