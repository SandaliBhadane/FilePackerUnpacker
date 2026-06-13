# 📦 File Packer & Unpacker with XOR Encryption

A Java-based console application that packs multiple files into a single packed file with XOR encryption, and unpacks them back with decryption.

---

## 🚀 Features

- Pack multiple `.txt` files from a folder into one single packed file
- XOR Encryption applied while packing
- XOR Decryption applied while unpacking
- Header-based file metadata storage (filename + size)
- Supports multiple files in one packed file

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts Used:** File I/O, FileInputStream, FileOutputStream, XOR Encryption, Header Formation, String Parsing

---

## 📁 Project Structure

```
FilePackerUnpacker/
│
├── 01_FileBasics/          → File create, delete, exists operations
├── 02_FileReadWrite/       → FileReader, FileWriter practice
├── 03_FileCopy/            → File copy using streams
├── 04_DirectoryOperations/ → Folder listing, file count
├── 05_Encryption/          → XOR encryption/decryption logic
├── 06_Packer/              → Packer with header + encryption
└── 07_Unpacker/            → Unpacker with header parsing + decryption
```

---

## ⚙️ How It Works

### Packing
1. Takes a folder name as input
2. Reads all `.txt` files from the folder
3. Creates a 100-byte header for each file (`filename + size`)
4. Applies XOR encryption on file data
5. Writes header + encrypted data into one packed file

### Unpacking
1. Takes packed file name as input
2. Reads 100-byte header → extracts filename and size
3. Reads exact bytes of file data
4. Applies XOR decryption
5. Creates and writes original files back

---

## 👩‍💻 Developer

**Sandali Bhadane**  
MCA Student | GH Raisoni College of Engineering & Management, Jalgaon

