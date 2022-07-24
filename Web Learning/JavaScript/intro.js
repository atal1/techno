//document.getElementById("counter").innerHTML = 6;

let count = 0;
//console.log(count);
let viewer = document.getElementById("counter");

function increment() {
  console.log("The button was clicked");
  count++;
  viewer.textContent = count;
}

function decrement() {
  console.log("The button was clicked");
  if (count > 0) {
    count--;
  }
  viewer.textContent = count;
}

function save() {
  let prevViewer = document.getElementById("save-el");
  console.log(prevViewer);
  let countstr = count + " - ";
  console.log("Save button was clicked");
  prevViewer.textContent += countstr;
  count = 0;
  viewer.textContent = count;
}
