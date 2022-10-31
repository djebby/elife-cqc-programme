//------------------------------------------------------------------------question 1, 2, 3
/*
const http = require('http');
const server = http.createServer(function(req, res) {
    res.writeHead(200);
    res.end('Salut les websites!');
});
server.listen(3000);
*/

//------------------------------------------------------------------------question 5, 6, 7, 8
/*
const http = require('http');
const server = http.createServer(function(req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.end('<p>Voici un paragraphe <strong>HTML</strong>!</p>');
});
server.listen(3000);
*/

//------------------------------------------------------------------------question 9
/*
const http = require("http");
const server = http.createServer(function (req, res) {
  res.writeHead(200, { "Content-Type": "text/html" });
  res.write(`
        <html>
            <head>
                <meta charset="utf-8" />
                <title>Ma page Node.js !</title>
            </head>
            <body>
                <p>Voici un paragraphe <strong>HTML</strong> !</p>
            </body>
        </html>
    `);
  res.end();
});
server.listen(3000);
*/

//------------------------------------------------------------------------question 10, 11, 12
/*
const http = require('http');
const url = require('url');
const server = http.createServer(function(req, res) {
    const page = url.parse(req.url).pathname;
    console.log(page);
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.write('Bien on avance!');
    res.end();
});
server.listen(3000);
*/


//------------------------------------------------------------------------question 13, 14, 15
/*
const http = require('http');
const url = require('url');
const server = http.createServer(function(req, res) {
    const page = url.parse(req.url).pathname;
    console.log(page);
    res.writeHead(200, {'Content-Type': 'text/plain'});
    if(page==='/') res.write('Vous etes dans la page d\'accueil');
    else if (page === '/Contact') res.write('Vous etes dans la page Contact !');
    else if (page.split('/')[1] === 'Affichage' && page.split('/')[3] === 'user') {
        const id = page.split('/')[2];
        res.write(`Affichez l'utilisateur qui a l'id ${id} !`);
    } else {
        res.writeHead(404, {'Content-Type': 'text/plain'});
        res.write('404 not found !');
    }
    res.end();
});
server.listen(3000);
*/


//------------------------------------------------------------------------question 16, 17, 18, 19, 20, 21
const http = require('http');
const url = require('url');
const querystring = require('querystring');

const server = http.createServer(function(req, res) {
    const page = url.parse(req.url).pathname;
    const params = querystring.parse(url.parse(req.url).query);
    res.writeHead(200, {'Content-Type': 'text/plain'});
    if('id' in params && 'login' in params) {
        console.log(page);
        res.write(`Votre id est ${params.id} et votre login ${params.login}\n`);
        if(page==='/') res.write('Vous etes dans la page d\'accueil');
        else if (page === '/Contact') res.write('Vous etes dans la page Contact !');
        else if (page.split('/')[1] === 'Affichage' && page.split('/')[3] === 'user') {
            const id = page.split('/')[2];
            res.write(`Affichez l'utilisateur qui a l'id ${id} !`);
        } else {
            res.write('404 not found !');
        }

    } else {
        res.write('Veuillez saisir votre id et login!');
    }
    res.end();
});
server.listen(3000);