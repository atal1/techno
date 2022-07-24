let firstname = document.getElementById("firstName").textContent;
let lastName = document.getElementById("lastName").textContent;
console.log(firstname);
function printFullName() {
  let fullname = firstname + " " + lastName;
  console.log(fullname);
}
