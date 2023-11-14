const exercise1 = require('./exercise1');

test('the final position of the submarine after executing the instructions', async () => {
  const result = await exercise1('example.dat');

  expect(result[0]*result[1]).toBe(150);
});