# 🎓 Student Information Sender (Java Socket Programming)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Socket Programming](https://img.shields.io/badge/Network-Socket_Programming-blue?style=for-the-badge)](https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html)

এই প্রোজেক্টটি জাভা সকেট প্রোগ্রামিং (TCP/IP) ব্যবহার করে তৈরি করা একটি ক্লায়েন্ট-সার্ভার অ্যাপ্লিকেশন। ক্লায়েন্ট অ্যাপ্লিকেশনটি স্টুডেন্টের আইডি, নাম এবং মার্কস ইনপুট নেয় এবং সার্ভারের কাছে পাঠায়। সার্ভার সেই ডাটা রিসিভ করে এবং কালেকশন ফ্রেমওয়ার্ক (HashMap/List) ব্যবহার করে প্রদর্শন করে।

## 📑 প্রোজেক্টের বৈশিষ্ট্য (Features)
- **Client-Server Communication:** TCP প্রোটোকল ব্যবহার করে রিয়েল-টাইম ডেটা ট্রান্সফার।
- **Dynamic Input:** ইউজার থেকে সরাসরি ইনপুট নেওয়ার সুবিধা।
- **Data Persistence (In-memory):** সার্ভার সাইডে `HashMap` এবং `ArrayList` ব্যবহার করে ডেটা স্টোর করা।
- **Record Display:** যতবার নতুন স্টুডেন্ট ডাটা পাঠানো হয়, সার্ভার পুরো লিস্টটি আপডেট করে দেখায়।

## 🛠 টেকনোলজি (Technologies Used)
- **Language:** Java 11+
- **APIs:** Java Network (`java.net`), Java IO (`java.io`)
- **Collections:** HashMap, ArrayList

## 🚀 রান করার নিয়ম (Installation & Usage)

প্রোজেক্টটি আপনার লোকাল মেশিনে রান করতে নিচের ধাপগুলো অনুসরণ করুন:

### ১. রিপোজিটরি ক্লোন করুন
```bash
git clone [https://github.com/YourUsername/Student-Information-Sender.git](https://github.com/YourUsername/Student-Information-Sender.git)
cd Student-Information-Sender

javac Server.java
javac Client.java
