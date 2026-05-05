# Java Swing Chat Application

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

A powerful and feature-rich real-time chat application built with **Java Swing**, delivering a modern desktop experience with intuitive UI and reliable messaging capabilities.

[Features](#features) • [Getting Started](#getting-started) • [Architecture](#architecture) • [Usage](#usage) • [Contributing](#contributing)

</div>

---

## 🎯 Overview

This Java Swing Chat Application is a desktop-based messaging platform designed for seamless real-time communication. Built entirely in Java using the Swing framework, it provides a robust foundation for peer-to-peer or client-server chat scenarios with a clean, user-friendly graphical interface.

## ✨ Features

- 🔄 **Real-time Messaging** - Send and receive messages instantly
- 👥 **User Management** - Create accounts and manage user profiles
- 🎨 **Modern UI** - Clean, intuitive Swing-based graphical interface
- 📝 **Message History** - View previous conversations
- 🔐 **Secure Communication** - Built with security best practices
- 💬 **Multiple Chat Windows** - Support for multiple simultaneous conversations
- 🎯 **User-friendly Interface** - Easy-to-navigate desktop application
- ⚡ **Responsive Design** - Fast and efficient message handling

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- **Java Development Kit (JDK)** 8 or higher
- **Maven** (optional, if using Maven for dependency management)
- **Git** for version control

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/AbhijatSinha05/Java_swing_App.git
   cd Java_swing_App
   ```

2. **Compile the project**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Run the application**
   ```bash
   java -cp bin com.chatapp.Main
   ```

   Or if using Maven:
   ```bash
   mvn clean compile exec:java
   ```

## 📋 Usage

### Launching the Application

1. Run the compiled JAR file or execute the main class
2. The login/registration window will appear
3. Create a new account or log in with existing credentials
4. Start chatting with other connected users

### Basic Operations

- **Send Message**: Type your message in the input field and press Enter or click Send
- **View History**: Scroll through the message area to see previous conversations
- **Manage Users**: Access user management options from the menu bar
- **Customize Settings**: Configure application preferences in the settings menu

## 🏗️ Architecture

### Project Structure

```
Java_swing_App/
├── src/
│   ├── com/
│   │   ├── chatapp/
│   │   │   ├── Main.java              # Entry point
│   │   │   ├── ui/                    # GUI components
│   │   │   ├── model/                 # Data models
│   │   │   ├── controller/            # Business logic
│   │   │   └── utils/                 # Utility functions
│   └── resources/                     # Images, configs, etc.
├── bin/                               # Compiled classes
├── README.md
└── .gitignore
```

### Technology Stack

| Component | Technology |
|-----------|-----------|
| **GUI Framework** | Java Swing |
| **Language** | Java |
| **Backend Logic** | Core Java |
| **Database** (optional) | SQLite/MySQL |

## 🛠️ Development

### Building from Source

```bash
# Clean and compile
javac -d bin -sourcepath src src/com/chatapp/**/*.java

# Create JAR file
jar cfm ChatApp.jar manifest.txt -C bin .
```

### Running Tests

```bash
# If test suite exists
java -cp bin:lib/junit-*.jar org.junit.runner.JUnitCore com.chatapp.tests.*
```

## 📝 Code Quality

- Follow Java naming conventions
- Use proper exception handling
- Maintain clean, readable code
- Add meaningful comments for complex logic
- Keep methods focused and single-responsibility

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. **Fork the repository**
   ```bash
   git clone https://github.com/yourusername/Java_swing_App.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```

3. **Make your changes and commit**
   ```bash
   git add .
   git commit -m "Add YourFeatureName with description"
   ```

4. **Push to your fork**
   ```bash
   git push origin feature/YourFeatureName
   ```

5. **Open a Pull Request** with a clear description of your changes

### Guidelines

- Write clear commit messages
- Test your changes thoroughly
- Update documentation as needed
- Follow the existing code style
- Add comments for non-obvious logic

## 🐛 Troubleshooting

### Common Issues

| Issue | Solution |
|-------|----------|
| "Cannot find symbol" error | Ensure all source files are in the correct classpath |
| GUI not rendering | Verify Swing dependencies are available on your system |
| Connection refused | Check if the server/host is running and accessible |
| Port already in use | Change the port in configuration or stop conflicting processes |

## 📚 Learning Resources

- [Java Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
- [Java Networking](https://docs.oracle.com/javase/tutorial/networking/)
- [Object-Oriented Programming](https://docs.oracle.com/javase/tutorial/java/concepts/)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Abhijat Sinha**
- GitHub: [@AbhijatSinha05](https://github.com/AbhijatSinha05)
- Email: as9639@srmist.edu.in

## 🎓 Future Enhancements

- [ ] Add group chat functionality
- [ ] Implement file transfer capabilities
- [ ] Add voice/video calling features
- [ ] Implement message encryption
- [ ] Add emoji support
- [ ] Create mobile companion app
- [ ] Add user status indicators
- [ ] Implement message reactions
- [ ] Add dark mode theme
- [ ] Database integration for persistence

## 💬 Support

If you encounter any issues or have questions:
- Open an [Issue](https://github.com/AbhijatSinha05/Java_swing_App/issues)
- Check existing issues and discussions
- Contact the maintainers

## ⭐ Show Your Support

Give a ⭐ if this project helped you! Your support motivates us to improve and maintain this project.

---

<div align="center">

**[⬆ Back to Top](#java-swing-chat-application)**

Made with ❤️ by Abhijat Sinha

</div>
