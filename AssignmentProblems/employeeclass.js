class Person {
    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
  }
  
  class Employee extends Person {
    constructor(name, age, role, contact) {
      super(name, age);
      this.role = role;
      this.contact = contact;
    }
  
    getDetails() {
      console.log(`The details of the Employee`);
      console.log(`Name: ${this.name}`);
      console.log(`Age: ${this.age}`);
      console.log(`Role: ${this.role}`);
      console.log(`Phone: ${this.contact}`);
    }
  }
  const emp = new Employee("Beron", 24, "Technology Analyst", "9001234567");
  
  emp.getDetails();