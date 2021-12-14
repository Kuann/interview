
# Networking
### TCP process
To establish a TCP connection, client and server have to make a 3-way hanshake process
1. Client send a package with SYN (synchronize) signal to server. Seq: x
2. Server send a package with ACK(y) signal and SYN signal(y).
3. Client send a package with ACK(y + 1) signal
3. (Optional) Client can also send SYN(x + 2) to transfer data.

To stop a TCP connection
1. Client send a package with FIN(x) signal to finsih a connection.
2. Server send a package with ACK(x + 1) signal and FIN(y) signal to client.
3. Client send a package with ACK(y + 1) to the server.

### TCP Header
Scr port, Dst port, flags(SYB, ACK, FIN), SYN sequence, ACK sequence, checksum.
Data

### HTTPS
- HTTPS mean HTTP over SSL.
- It relies on TLS/SSL to be secure.
- HTTP is a data communication protocal at application layer for webs.
### HTTPS process
1. Client issue a request to server.
2. Server send it's certificate with its public key.
3. Client verify the certificate against trusted Certificate Authority.
4. Client create a symetric key, use server's public key to enrypt it and send to the server.
5. Server decrypt the symetric key by it's private key.
6. That can start communicating. Connection is encrypted using the symetric key. 
### CA
Certificate authority (CA) is an entity that issues certificates.
### TCP vs UDP
|  TCP|UDP  |
|--|--|
|Reliable  | No |
|Maintain connection  | No |
|Grarantee the delivery of a package to the dst  | No |
|Has seq to know the order of packages  | No |
|Heavier, slower  | Lightweight, faster |
|No broadcast nor multi-cast  | Can broadcast or multi-cast |
|HTTP, HTTPs, FTP, SMTP  | DNS, DHCP or audio and video streaming|

# Operating System
### Process vs Thread
- A process is the execution of a program.
- A thread is an execution path that is part of a process.
- A process can have 1 or more threads.
- Processes are more isolated then threads.
- Each process has separate memory and some other resources.
- Threads in a same process can share memory and resources. So communication between threads in a same process is easier.
- Processes can communicate via sockets, files.
### Virtual memory
### Page
### Big Endian and Little Endian
- A big-endian system stores the most significant byte of a word at the smallest memory address.
- A little-endian system stores the least-significant byte at the smallest address.
- Endianness is the order of bytes of a word of in memory.
- A Word (4 bytes) is the natural unit of data for a particular processor design.
