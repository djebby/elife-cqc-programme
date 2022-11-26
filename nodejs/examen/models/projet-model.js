const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const projet = new Schema({
    libelle: String,
    description: String,
    duree: Number
});

module.exports = mongoose.model('projet', projet);