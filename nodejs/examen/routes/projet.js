var express = require('express');
var router = express.Router();
const Projet = require('../models/projet-model.js');

router.get('/', async (req, res, next)=> {

  const projets = await Projet.find();

  console.log(projets);

  res.render('projets', {projets});

});




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

router.get('/modifier/:libelle', async (req, res, next) => {
  const libelle = req.params.libelle;
  const projet = await Projet.findOne({ libelle });
  console.log(projet);
  res.render('modifier-projet', {projet});
});



router.post('/modifier/:libelle', async (req, res, next)=> {
  const { libelle, description, duree } = req.body;

  const projet = await Projet.findOneAndUpdate({ libelle }, {libelle, description, duree: +duree });

  res.redirect('/projet');

});



router.get('/supprimer/:libelle', async (req, res, next)=>{
  const libelle = req.params.libelle;

  await Projet.findOneAndDelete({libelle});

  res.redirect('/projet');
});

router.get('/recherche', async (req, res, next) => {

  const duree = req.query['duree'];

  console.log(duree);

  
  if(duree) {
    
    const projet = await Projet.findOne({duree: +duree});
    res.render('recherche', {projet});
  } else {
    res.render('recherche');
  }


});




module.exports = router;



/*

{% for example in examples %}

    <h5> {{ example._id }} ===>>> {{ example.field01 }} || {{ example.field02 }} || {{ example.field03 }} </h5>

{% endfor %}
*/