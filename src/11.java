// Create a function to generate a random number between 1 and 10
function getRandomNumber() {
  // Generate a random number between 1 and 10
  const randNum = Math.floor(Math.random() * 10) + 1;

  return randNum;
}

// Use the function to generate a random number
const myRandomNumber = getRandomNumber();
console.log(myRandomNumber); // Output: 4 (for example)
