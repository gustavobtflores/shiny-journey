const largeArray = Array.from({ length: 100000000 }, (_, index) => index + 1);

function binarySearch(list, item) {
  let low = 0;
  let high = list.length - 1;
  let mid = 0;

  while (low <= high) {
    mid = Math.floor((low + high) / 2);

    if (list[mid] === item) {
      return mid;
    }

    if (list[mid] > item) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }

  return null;
}

function linearSearch(array, item) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] === item) {
      return i;
    }
  }
  return -1;
}

/*
  Binary search vs linear search performance 
  with random numbers and 1000 runs
*/
let rng = Math.round(Math.random() * 100000000);

console.time("binarySearchTime");

for (let i = 0; i < 1000; i++) {
  binarySearch(largeArray, rng);
}

console.timeEnd("binarySearchTime");

console.time("linearSearchTime");

for (let i = 0; i < 1000; i++) {
  linearSearch(largeArray, rng);
}

console.timeEnd("linearSearchTime");
