const arr1 = [ 1, 2, 3, 4, 5 ];
const arr2 = [1, 2, 3, 5 ];

const x = arr1.filter(x => !arr2.includes(x));
const y = arr2.filter(x => !arr1.includes(x));

const difference = x.concat(y);

console.log(difference);