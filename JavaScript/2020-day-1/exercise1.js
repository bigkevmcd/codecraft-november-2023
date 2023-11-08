const fs = require('fs');
const readline = require('readline');

module.exports = async function (filename, total) {
  const expenses = await parseExpenses(filename);

  throw new Error('not implemented');
};

const parseExpenses = async function (filename) {
  const reader = readline.createInterface({ 
      input: fs.createReadStream(filename), 
      terminal: false
  });

  const result = [];

  reader.on('line', (line) => {
    result.push(parseInt(line));
  });

  await new Promise((res) => reader.once('close', res));

  return result;
};