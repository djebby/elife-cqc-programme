var express = require('express');
var router = express.Router();
const Projet = require('../models/projet-model.js');

/* GET users listing. */
router.post('/ajouter', async (req, res, next) => {

  const { libelle, description, duree } = req.body;

  console.log(libelle, description, duree);

  const projet = new Projet({
    libelle: libelle,
    description: description,
    duree: +duree
  });
  const result = await projet.save();
  res.redirect('/projet/ajouter');
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