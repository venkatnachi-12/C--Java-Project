STEPS TO COMPILE THE C++ JAVA PROJECT:

Method to run the code:

On Windows or Linus or macOS:(Commands in BOLD)
  Implement the following commands in command prompt:

1.	javac *.java-This command compiles the java code and generates a .class file.

2.	javac -h. UserManagement.java-This generates the JNI header file                 using javac -h:

3.	On Windows: -I"C:\Program Files\Java\jdk
23\include”I"C:\Program Files\Java\jdk-23\include\win32" -shared -o UserManagement.dll UserManagement.cpp- The g++ command compiles UserManagement.cpp into a shared library ( UserManagement.dll), which Java loads at runtime.

On Linux or macOS: g++ -I"/usr/lib/jvm/java-23-openjdk/include" -I"/usr/lib/jvm/java-23-openjdk/include/linux" -shared -o libUserManagement.so UserManagement.cpp.

The path entered before the name of cpp and output shared library file depends on which directory the jdk is installed.

 4.java -Djava.library.path=. Main-This command specifies the path to the shared
library, enabling the JVM to load libUserManagement.so or UserManagement.dll for running the c++ java combined project finally.

Commands implemented with their format:
1.ADD_USER phone_no. password name(3 parameters)

2.LOGIN_USER phone_no. password(2 parameters)

3.LOGIN_SECURITY security_Id password(2 parameters)

4.LOGOUT_SECURITY security_Id(1 parameter)

5.REMOVE_USER phone_no.(1 parameter)

6.LOGOUT_USER phone_no(1 parameter)

7.EXIT(no parameters)

8.ADD_ORDER phone_no otp service_name(3 parameters)

9.MODIFY_ORDER  phone_no otp service_name(3 parameters)

10.SHOW_ORDERS phone_no.(1 parameter)

11.SEARCH_ORDERS (no parameters)

12.SHOW_USERS(no parameters)

13.REMOVE_ORDERS phone_no.(1 parameter)

14.MODIFY_OTP phone_no.(1 parameter)

15.MODIFY_SERVICE phone_no.(1 parameter)

16.ALL_ORDERS phone_no.(1 parameter)

17.SEARCH phone_no.(1 parameter)
