var express = require('express');
var router = express.Router();
const Projet = require('../models/projet-model.js');

/* GET users listing. */
router.post('/ajouter', async (req, res, next) => {
  // const example = new Example({
  //   field01: 'field01 with of type string',
  //   field02: 5,
  //   field03: false
  // });
  // const result = await example.save();
  // res.send(result);

  console.log("post method from the formulair ....");
});


router.get('/ajouter', async (req, res, next) => {
  // const examples = await Example.find();
  res.render('ajouter-projet');
});

module.exports = router;



/*

{% for example in examples %}

    <h5> {{ example._id }} ===>>> {{ example.field01 }} || {{ example.field02 }} || {{ example.field03 }} </h5>

{% endfor %}
*/