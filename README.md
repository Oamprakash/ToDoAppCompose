# 📱 ToDo App  

A modern Android app built with **Jetpack Compose, MVVM, Kotlin Coroutines, Flow, Hilt, and Clean Architecture**.  
This project is part of my Android portfolio to showcase scalable and production‑ready development practices.  

---

## 🖼️ Screenshots  

| Home Screen | Details Screen | Dark Mode |  
|-------------|---------------|-----------|  
| <img src="screenshots/home.png" width="200"/> | <img src="screenshots/details.png" width="200"/> | <img src="screenshots/dark.png" width="200"/> |  

*(Replace with actual screenshots once app UI is ready)*  

---

## 🚀 Features  

- ✨ Modern UI built with **Jetpack Compose + Material 3**  
- 📂 Local storage with **Room Database + Flow**  
- 🔔 Notifications & WorkManager  
- 🎨 Dark / Light theme support  
- 🌐 API integration with Retrofit (if applicable)  
- ☁️ Firebase integration (if applicable)  
- ✅ Unit & UI Testing  

---

## 🛠 Tech Stack  

- **Kotlin**  
- **Jetpack Compose**  
- **Hilt (DI)**  
- **Room Database**  
- **Navigation Component**  
- **Coroutines + Flow**  
- **Retrofit / Firebase** (if used)  
- **JUnit, Mockk, Espresso** (Testing)  

---

## 🏗️ Architecture  

This project follows **Clean Architecture + MVVM** with multi‑module separation (if used).  

presentation (UI layer - Jetpack Compose)
|
domain (business logic - use cases)
|
data (repositories, API, Room DB)



---

## 📂 Project Structure  

app/
┣ data/
┃ ┣ local/ # Room Entities & DAO
┃ ┣ remote/ # Retrofit API Service
┃ ┣ repository/ # Repository Implementations
┣ domain/
┃ ┣ model/ # Domain Models
┃ ┣ usecase/ # Business Logic
┣ presentation/
┃ ┣ ui/ # Compose Screens
┃ ┣ viewmodel/ # ViewModels
┣ di/ # Hilt Modules



## ⚙️ Setup  

1. Clone the repo:  
   ```bash
   git clone https://github.com/oamprakash/todoappcompose.git
Open in Android Studio (Koala / Ladybug or newer)

Sync Gradle and run on emulator or device

🧪 Testing
Unit Tests → JUnit, Mockk

UI Tests → Espresso, Compose Testing

Run with:


./gradlew test
./gradlew connectedAndroidTest
🔗 Demo / Play Store
📲 Download on Google Play
(Add link if published)

📌 Roadmap
 Add search/filter feature

 Add Firebase sync

 Add CI/CD with GitHub Actions

 Add WearOS companion app

🏆 About Me
I’m Oamprakash, an Android Developer passionate about building scalable apps with modern Android practices.

🌐 LinkedIn

🐙 GitHub

✍️ Medium

📜 License
This project is licensed under the MIT License. See LICENSE for details.






