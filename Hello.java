/public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!!!!");
    }
}
<!DOCTYPE html>
<html>
<body 
style="text-align:center"
>
  <h1>Sum</h1>
  <input id="a" type="number">
  <input id="b" type="number">
  <button onclick="r.textContent = +a.value + +b.value">
    Add
  </button>
  <p>Result: <span id="r">0</span></p>
</body>
</html>
    import { Builder, By } from "selenium-webdriver";

(async () => {
  const d = await new Builder().forBrowser("chrome").build();
  await d.get("file://" + process.cwd() + "/index.html");

  await d.findElement(By.id("a")).sendKeys("50");
  await d.findElement(By.id("b")).sendKeys("10");
  await d.findElement(By.css("button")).click();

  const result = await d.findElement(By.id("r")).getText();
  console.log("Result:", result);

  console.log("Press ENTER to close browser...");
  process.stdin.resume();
  process.stdin.on("data", async () => {
    await d.quit();
    process.exit(0);
  });
})();
//
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Registration - FBS eBooks</title>
<script>
function validate() {
  const f = document.f1;
  const { username, password, email, phno, address, gen, lang } = f;

  // Username
  if (!username.value || username.value.length < 8)
    return alert("Enter username (min 8 chars)"), username.focus(), false;

  // Password
  if (!password.value || password.value.length < 6)
    return alert("Enter password (min 6 chars)"), password.focus(), false;

  // Email
  if (!email.value.includes("@"))
    return alert("Enter valid Email ID"), email.focus(), false;

  // Phone
  if (!phno.value || isNaN(phno.value) || phno.value.length !== 10)
    return alert("Enter valid 10-digit Phone Number"), phno.focus(), false;

  // Gender
  if (![...gen].some(r => r.checked))
    return alert("Select Gender"), false;

  // Language
  if (![...lang].some(c => c.checked))
    return alert("Select at least one Language"), false;

  // Address
  if (!address.value.trim())
    return alert("Enter Address"), address.focus(), false;

  alert("Registration Successful!");
}
</script>
</head>
<body>
<center>
<h3>Registration Form</h3>
<form name="f1">
<table cellpadding="5">
  <tr>
    <td>User Name*:</td>
    <td><input type="text" name="username"></td>
  </tr>
  <tr>
    <td>Password*:</td>
    <td><input type="password" name="password"></td>
  </tr>
  <tr>
    <td>Email ID*:</td>
    <td><input type="text" name="email"></td>
  </tr>
  <tr>
    <td>Phone No*:</td>
    <td><input type="text" name="phno"></td>
  </tr>
  <tr>
    <td>Gender*:</td>
      <td><input type="radio" name="gen" value="Male">Male
          <input type="radio" name="gen" value="Female">Female
        </td>
        </tr>
  <tr>
    <td>Languages*:</td>
      <td><input type="checkbox" name="lang" value="English">English
          <input type="checkbox" name="lang" value="Telugu">Telugu
          <input type="checkbox" name="lang" value="Hindi">Hindi
          <input type="checkbox" name="lang" value="Tamil">Tamil</td>
        </tr>
  <tr>
    <td>Address:</td>
    <td><textarea name="address"></textarea>
    </td>
  </tr>
  <tr>
    <td></td>
      <td><input type="button" value="SUBMIT" onclick="validate()">
          <input type="reset" value="RESET"></td>
        </tr>
</table>
<small style="color:red;">* All fields are mandatory</small>
</form>
</center>
</body>
</html>
    //pipeline
    pipeline { 
    agent any 
     
    stages { 
        stage('Build') { 
            steps { 
                echo 'Building the project...' 
          // bash/shell commands 
            }  
 } 
         
        stage('Test') { 
            steps { 
                echo 'Running tests...' 
          // bash/shell commands 
            } 
        } 
         
        stage('Deploy') { 
            steps { 
                echo 'Deploying the application...' 
          // bash/shell commands 
            } 
        } 
    } 
     
    post { 
        success { 
            echo 'Pipeline executed successfully!' 
        } 
        failure { 
            echo 'Pipeline failed. Please check the logs for details.' 
        } 
    }
}

