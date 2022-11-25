var express = require('express');
var router = express.Router();
const Example = require('../models/model-example.js');

/* GET users listing. */
router.post('/', async (req, res, next) => {
  const example = new Example({
    field01: 'field01 with of type string',
    field02: 5,
    field03: false
  });
  const result = await example.save();
  res.send(result);
});


router.get('/', async (req, res, next) => {
  const examples = await Example.find();
  res.render('examples', {examples});
});

module.exports = router;
