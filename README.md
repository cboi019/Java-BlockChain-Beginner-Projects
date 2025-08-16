Java Blockchain Tamper-Proof Simulation
Overview

This is a simple Java blockchain simulation that demonstrates how block tampering can be detected using hash validation and a frozen copy of the block data.
It includes features like constructors, getters/setters, and chain validation.

The project is designed for educational purposes to help understand:

How blocks are linked via hashes

How tampering breaks the chain

How a frozen copy can detect changes even if the main data is altered in memory

Project Structure:

Java Blockchain Simulation

 access.java       // Represents a single block
 CboiCodes.java  // Handles blockchain creation & validation
 README.md        // Project documentation

Requirements:

Java 8 or higher

Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

Features:

Constructor-based block creation

SHA-256 hashing

Frozen copy of block data for tamper detection

Getters and setters for secure access

Chain validation using isChainValid()

How It Works:
1. Each access contains:

Data → stores the actual current data.

DataCopy → stores an untouched frozen copy from when the block was created.

hashvalue → stores the hash of the original data.

previousHash → links this block to the previous block.

2. A hash is calculated for each block using SHA-256 when the block is created.

3. The isChainValid() method:

Compares the hash of the current Data with the hash of the DataCopy.

If they are different, it means the data was changed after block creation.

Also checks if each block’s previousHash matches the hashvalue of the previous block.

Example Tampering Detection:
// Tampering example
blockchain.get(1).setData(Citizen2) = "Fake Vote";
System.out.println(blockchain.isChainValid()); // false

How to Run:

Download the project files.

Open in IntelliJ IDEA, Eclipse, or VS Code with Java installed.

Run the BlockChain.java file.

Observe how the chain is created and validated.

Example Output:
BLOCK 1
{block data and hash...}
BLOCK 2
{block data and hash...}

Tamper Check for Block 2...
Is Chain Valid? false

Author

Charles Okoronkwo
Aspiring Blockchain Developer | Forex Trader
Oguta LGA, Imo State, Nigeria
