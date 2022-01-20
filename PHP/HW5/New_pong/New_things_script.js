//---------------------------------------

var board = document.getElementById("board");
var ctx = board.getContext("2d");
ctx.beginPath();
ctx.arc(95, 50, 40, 0, 2 * Math.PI);
ctx.stroke();

var space = false;
// Is a bullet already on the canvas?
var shooting = false;

// Create an object representing a square on the canvas
function makeSquare(x, y, length, speed) {
    return {
        x: x,
        y: y,
        l: length,
        s: speed,
        draw: function () {
            context.fillRect(this.x, this.y, this.l, this.l);
        }
    };
}
// The bulled shot from the ship
var bullet = makeSquare(0, 0, 10, 10);


// Shoot the bullet (if not already on screen)
function shoot() {
    if (!shooting) {
        shooting = true;
        bullet.x = leftPaddle.x + leftPaddle.l;
        bullet.y = leftPaddle.y + leftPaddle.l / 2;
    }
}



const net = {
    x: canvas.width / 2 - 2 / 2,
    y=0,
    width: 2,
    height: 10,
    color: "WHITE",
}
function drawNet() {
    for (let i = 0; i <= canvas.height; i += 15) {
        drawRect(net.x, net.y + i, net.width, net.height, net.color)
    }
}



function draw() {
    erase();
    // Move and draw the bullet
    if (shooting) {
        // Move the bullet
        bullet.x += bullet.s;
    }
    bullet.draw();

}

//try to change the paddle colors make two right paddles

//---------------------------------------

