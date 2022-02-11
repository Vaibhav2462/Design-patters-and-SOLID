const http = require("http");
const url = require("url");
const port = 4200;
const hostname = "127.0.0.1";

const server = http.createServer((req, res) => {
  const URLObj = url.parse(req.url, true).query;
  res.end(URLObj.name);
});

server.listen(port, hostname, () => {
  console.log("Server created: 4200");
});