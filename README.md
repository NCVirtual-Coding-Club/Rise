# Rise for Android
## General Information

### Video Pitch (Ready, Set, App 2022)
[![Video Pitch](https://img.youtube.com/vi/CNvMPTPg6lQ/0.jpg)](https://youtu.be/CNvMPTPg6lQ)

### Inspiration
Our team wanted to create an app that could be of use to everyone in our community. With the impact of COVID-19 on students and adults and the constant increase of stress and mental health problems with the ongoing national and global crises, it was clear that something needed to be done. Our team was inspired by these problems to create a solution for everyone and anyone to use.

### What it does
Rise is an app that brings physical and mental health support solutions in one central application. Rise includes a calendar to keep track of deadlines and important dates to an activities page to relax and relieve tension, to even a support page for health contacts. Rise strives to assist others in their daily lives to educate and relieve any stress or problems they may be facing.

### How we built it
Our app was created through Android Studio using Java.

### Challenges we ran into
Throughout the creation of our app, we ran into many difficulties. It was originally difficult for our team to even come up with what exactly our app would include since we all had so many ideas and we all had different thoughts on how to go about this app. It was a challenge to cut down and amend our thought processes with what we needed and create the perfect solution.

It was also a challenge to meet together with the team as a whole since we were all working on this app completely virtually from different places in North Carolina.

In terms of coding, it was a challenge to code for the Agenda section of our app. The Agenda required over three weeks of development time and hundreds of lines of code. In addition, the data from the agenda had to be stored locally on the device using the Room API, an interface our group had never used before. Personally, it was very difficult for us to implement. We had to switch from the Room API’s documentation to independent tutorials, to online forums in order to properly implement Room.

### Accomplishments that we're proud of
First and foremost, we're proud that we as a team were able to get so far with our app and complete it on time! We're sure that this app will help many others and we're proud of this accomplishment alone. We're also proud that we were able to make time for this app in spite of our busy schedules consumed by school and extracurriculars. We're proud that we made an app on a platform that was very new to us and we're proud that we did so much research and put in the effort to make the best final solution for our app.

### What we learned
We learned so much as a team! We definitely learned a lot in terms of coding and using Android Studio and Java as this was a first time for many of us. We also learned a lot about each other and even ourselves during this process. We learned about what we like to do, our strengths, weaknesses, and so much more!

### What's next for Rise
We have so much planned for the future of Rise! We'd like to improve our agenda into a more robust Agenda system and add more activities for physical and mental health support. We would also love to add more information, contacts, and many more features to address specific illnesses as well.


## Development
### Getting Started
All development will be through the Android Studio IDE. Please install the latest version of the IDE from the [Android Studio website](https://developer.android.com/studio/index.html). During installation, use the default settings. Install the Android 9.0 (Pie) SDK.

![image](https://user-images.githubusercontent.com/39242954/152127209-b1c0e257-5b8c-4884-84d0-ebeb02844884.png)


After installing the IDE, you will need to install [Git](https://git-scm.com/), [GitHub Desktop](https://desktop.github.com/), and [Github CL](https://cli.github.com/).

After successfully completing the steps above, go to the Rise GitHub repository, `code`, and `Open with GitHub Desktop`. Clone the repository.

![Screenshot 2022-02-02 at 03-59-21 NCVirtual-Coding-Club Rise](https://user-images.githubusercontent.com/39242954/152126982-a8a644ac-b9be-433b-bf24-b1d8e799200f.png)

To open the folder in Android Studio, in Android Studio, click `File`, `Open`, and select the folder that was cloned to your computer.

![image](https://user-images.githubusercontent.com/39242954/152127111-16b01b1c-8881-443a-94d8-6f25fceee408.png)

After a few minutes, the project will be available in Android Studio.

### Project Syntax
#### IDs: 
Syntax: `@+id/<component_title>_<activity_title>_<name>`

Example: `@+id/card_home_recommendedActivities`
#### Strings: 
Syntax: `@string/<activity_title>_<group>_<string_usage>`

Example: `@string/support_emergency_description`
