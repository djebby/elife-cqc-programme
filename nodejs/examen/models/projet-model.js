const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const projet = new Schema({
    libelle: String,
    description: Number,
    duree: Boolean
});

module.exports = mongoose.model('projet', projet);