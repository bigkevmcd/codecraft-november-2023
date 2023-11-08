const exercise1 = require('./exercise1');

test('finding expenses that add up to to the correct value', async () => {
  const result = await exercise1('example.dat', 2020);

  expect(result[0]*result[1]).toBe(514579);
});