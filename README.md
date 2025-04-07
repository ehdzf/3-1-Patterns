# Patterns

## Singleton pattern

### Description

Create a class that stores all commands on all terminals. This class should be a singleton_pattern so that the memory is shared across all terminals.

Made the singleton_pattern class thread safe so that it can be used in a multi-threaded environment.

Run the `singleton_pattern.Main` class to see the singleton_pattern in action.

```bash
java src/main/java/singleton_pattern/Main.java
```

### Implementation file

`singelton.memory.MemoryStack`

#### Test file
`singelton.memory.MemoryStackTest`

### Thread safe usage

`singleton_pattern.terminal.RunnabeTerminal`

#### Test file
`singleton_pattern.terminal.RunnabeTerminalTest`


## Abstract Factory pattern

### Description
Create an address book that properly stores contact addresses and phone numbers formatted for the country of the contact.
Use an abstract factory to create the address book and the contacts.

Classes:
- `AddressBook` : static class that creates and stores the contacts in a list.
  - methods: 
    - `addContact` : adds a contact to the list.
    - `showContacts` : displays all the contacts in the console.
- `Contact` : This class takes the contact name and the address as arguments, selects the proper factory depending on the country and creates the contact.
- `ContactFactory` : interface that defines the methods to create the contact and the address.
  - `FranceContactFactory` : implements the `ContactFactory` interface and creates the contact and address for France.
  - `SpainContactFactory` : implements the `ContactFactory` interface and creates the contact and address for Spain.
- `Address` : Interface that defines the methods to create the address.
  - `FranceAddress` : implements the `Address` interface and creates the address for France.
  - `SpainAddress` : implements the `Address` interface and creates the address for Spain.
- `Phone`: Interface that defines the methods to create the phone number.
  - `FrancePhone` : implements the `Phone` interface and creates the phone number for France.
  - `SpainPhone` : implements the `Phone` interface and creates the phone number for Spain.

### Tests:

Implemented 4 arbitrary cases to test the abstract factory is used properly.

`ContactTest`:
- Spain contact phone number starts with 34
- France contact phone number starts with 33
- Spain contact address contains province
- France contact address does not contain province

### Run the code
```bash
java src/main/java/abstract_factory_pattern/Main.java
```

## Command pattern

### Description

Using the command pattern, create vehicles that have the ability to start, accelerate and execute. You should be able to run this commands from a Parking garage on every vehicle inside.
Vevhicles can be cars, planes, bicycles or ships.

### package name
`command_pattern`

### Run the code
```bash
java src/main/java/command_pattern/Main.java
```