const fs = require('fs');
const readline = require('readline');

module.exports = async function (filename, total) {
  const instructions = await parseInstructions(filename);

  throw new Error('not implemented');
};

const parseInstructions = async function (filename) {
  const reader = readline.createInterface({ 
      input: fs.createReadStream(filename), 
      terminal: false
  });

  const result = [];

  reader.on('line', (line) => {
    const elements = line.split(/\s+/);

    result.push({op: elements[0], delta: elements[1]});
  });

  await new Promise((res) => reader.once('close', res));

  return result;
};