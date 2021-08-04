function spinalCase(str) {
    return str
        .split(/\s|_|(?=[A-Z])/)
        .join('-')
        .toLowerCase()
}
console.log(spinalCase('AllThe-small Things'));
console.log(spinalCase('This Is Spinal Tap'));