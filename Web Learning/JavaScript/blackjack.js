let cards = [];
let sum = 0;
let cardsMessage = document.getElementById("cards-el");
let sumMessage = document.getElementById("sum-el");

function randomCard() {
  let random = Math.floor(Math.random() * 11 + 1);
  console.log(random);
  return random;
}

function startGame() {
  cards.push(randomCard());
  cards.push(randomCard());

  cards.forEach((element) => {
    cardsMessage.textContent += element + " ";
    sum += element;
  });

  document.getElementById("start-el").style.display = "none";
  sumMessage.textContent += sum;
  checkBlackJack();
}

function checkBlackJack() {
  let message = document.querySelector("#message-el");
  let newCard = document.getElementById("new-el");
  if (sum < 21) {
    message.textContent = "You can ask for a new card";
  } else if (sum === 21) {
    message.textContent = "Congratts!! You got the BlackJack!!!";
    newCard.style.display = "none";
  } else {
    message.textContent = "You are out of the game.";
    newCard.style.display = "none";
  }
}
function newCard() {
  let newC = randomCard();
  sum += newC;
  cards.push(newC);
  cardsMessage.textContent += newC + " ";
  sumMessage.textContent = "Sum : " + sum;
  checkBlackJack();
}
