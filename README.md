Java Blockchain Tamper-Proof Simulation
Overview

This is a simple Java blockchain simulation that demonstrates how block tampering can be detected using hash validation and a frozen copy of the block data.
It includes features like constructors, getters/setters, and chain validation.

The project is designed for educational purposes to help understand:

How blocks are linked via hashes

How tampering breaks the chain

How a frozen copy can detect changes even if the main data is altered in memory

==================================================================

Project Structure:

Java Blockchain Simulation

 access.java       // Represents a single block
 CboiCodes.java  // Handles blockchain creation & validation
 README.md        // Project documentation
 
==================================================================

Requirements:

Java 8 or higher

Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

==================================================================

Features:

Constructor-based block creation

SHA-256 hashing

Frozen copy of block data for tamper detection

Getters and setters for secure access

Chain validation using isChainValid() 

==================================================================

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

==================================================================

PICTORIAL VIEW (Important Highlights):
1. https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/Block/Screenshot%202025-08-21%20143430.png: (in the access file) Shows the isChainValid method that detects tampering.

2. https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20143511.png: (in the main file: CboiCodes) Show List of registered Voters, 2 in this case, please Don't mind the duplicating mistake, get.previoushashvalue can make each block have it's unique hash.

3. https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20143634.png: Shows a Tamper Check code to simulate real life tampering, here, the block data is intact and when we run it;

--- https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20143717.png: After we run it, this is the output, Block 1 and 2 with their data and unique hash. 

--- https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20143740.png: Since we didn't change or remove any data, Chain is Valid.

4. https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20143950.png: Now let's tamper with it by removing Block 0 Citizen Data - the first Block;

https://github.com/cboi019/Java-BlockChain-Beginner-Projects/blob/main/src/Screenshots/BlockChain/Screenshot%202025-08-21%20144142.png: After we run it, as you can see.. the System detects the change and points which Block has been altered, in this case, Block 0 - the first Block.

==================================================================

Author:
Charles Okoronkwo
Aspiring Blockchain Developer | Forex Trader
Oguta LGA, Imo State, Nigeria
