const mongoose = require('mongoose');
const Schema = mongoose.Schema;


const example = new Schema({
    field01: String,
    field02: Number,
    field03: Boolean
});

module.exports = mongoose.model('model_example', example);