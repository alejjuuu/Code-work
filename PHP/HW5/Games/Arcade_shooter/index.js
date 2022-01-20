// Arcade Shooter game

// Get a reference to the canvas DOM element
var canvas = document.getElementById('canvas');
// Get the canvas drawing context
var context = canvas.getContext('2d');

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

// The ship the user controls
var ship = makeSquare(50, canvas.height / 2 - 25, 50, 5);

// Flags to tracked which keys are pressed
var up = false;
var down = false;
var space = false;

// Is a bullet already on the canvas?
var shooting = false;
// The bulled shot from the ship
var bullet = makeSquare(0, 0, 10, 10);

// An array for enemies (in case there are more than one)
var enemies = [];

// Add an enemy object to the array
var enemyBaseSpeed = 2;
function makeEnemy() {
    var enemyX = canvas.width;
    var enemySize = Math.round((Math.random() * 15)) + 15;
    var enemyY = Math.round(Math.random() * (canvas.height - enemySize * 2)) + enemySize;
    var enemySpeed = Math.round(Math.random() * enemyBaseSpeed) + enemyBaseSpeed;
    enemies.push(makeSquare(enemyX, enemyY, enemySize, enemySpeed));
}

// Check if number a is in the range b to c (exclusive)
function isWithin(a, b, c) {
    return (a > b && a < c);
}

// Return true if two squares a and b are colliding, false otherwise
function isColliding(a, b) {
    var result = false;
    if (isWithin(a.x, b.x, b.x + b.l) || isWithin(a.x + a.l, b.x, b.x + b.l)) {
        if (isWithin(a.y, b.y, b.y + b.l) || isWithin(a.y + a.l, b.y, b.y + b.l)) {
            result = true;
        }
    }
    return result;
}

// Track the user's score
var score = 0;
// The delay between enemies (in milliseconds)
var timeBetweenEnemies = 5 * 1000;
// ID to track the spawn timeout
var timeoutId = null;

// Show the game menu and instructions
function menu() {
    erase();
    context.fillStyle = '#000000';
    context.font = '36px Arial';
    context.textAlign = 'center';
    context.fillText('Shoot \'Em!', canvas.width / 2, canvas.height / 4);
    context.font = '24px Arial';
    context.fillText('Click to Start', canvas.width / 2, canvas.height / 2);
    context.font = '18px Arial';
    context.fillText('Up/Down to move, Space to shoot.', canvas.width / 2, (canvas.height / 4) * 3);
    // Start the game on a click
    canvas.addEventListener('click', startGame);
}

// Start the game
function startGame() {
    // Kick off the enemy spawn interval
    timeoutId = setInterval(makeEnemy, timeBetweenEnemies);
    // Make the first enemy
    setTimeout(makeEnemy, 1000);
    // Kick off the draw loop
    draw();
    // Stop listening for click events
    canvas.removeEventListener('click', startGame);
}

// Show the end game screen
function endGame() {
    // Stop the spawn interval
    clearInterval(timeoutId);
    // Show the final score
    erase();
    context.fillStyle = '#000000';
    context.font = '24px Arial';
    context.textAlign = 'center';
    context.fillText('Game Over. Final Score: ' + score, canvas.width / 2, canvas.height / 2);
}

// Listen for keydown events
canvas.addEventListener('keydown', function (event) {
    event.preventDefault();
    if (event.keyCode === 38) { // UP
        up = true;
    }
    if (event.keyCode === 40) { // DOWN
        down = true;
    }
    if (event.keyCode === 32) { // SPACE
        shoot();
    }
});

// Listen for keyup events
canvas.addEventListener('keyup', function (event) {
    event.preventDefault();
    if (event.keyCode === 38) { // UP 
        up = false;
    }
    if (event.keyCode === 40) { // DOWN
        down = false;
    }
});

// Clear the canvas
function erase() {
    context.fillStyle = '#FFFFFF';
    context.fillRect(0, 0, 600, 400);
}

// Shoot the bullet (if not already on screen)
function shoot() {
    if (!shooting) {
        shooting = true;
        bullet.x = ship.x + ship.l;
        bullet.y = ship.y + ship.l / 2;
    }
}

// The main draw loop
function draw() {
    erase();
    var gameOver = false;
    // Move and draw the enemies
    enemies.forEach(function (enemy) {
        enemy.x -= enemy.s;
        if (enemy.x < 0) {
            gameOver = true;
        }
        context.fillStyle = '#00FF00';
        enemy.draw();
    });
    // Collide the ship with enemies
    enemies.forEach(function (enemy, i) {
        if (isColliding(enemy, ship)) {
            gameOver = true;
        }
    });
    // Move the ship
    if (down) {
        ship.y += ship.s;
    }
    if (up) {
        ship.y -= ship.s;
    }
    // Don't go out of bounds
    if (ship.y < 0) {
        ship.y = 0;
    }
    if (ship.y > canvas.height - ship.l) {
        ship.y = canvas.height - ship.l;
    }
    // Draw the ship
    context.fillStyle = '#FF0000';
    ship.draw();
    // Move and draw the bullet
    if (shooting) {
        // Move the bullet
        bullet.x += bullet.s;
        // Collide the bullet with enemies
        enemies.forEach(function (enemy, i) {
            if (isColliding(bullet, enemy)) {
                enemies.splice(i, 1);
                score++;
                shooting = false;
                // Make the game harder
                if (score % 10 === 0 && timeBetweenEnemies > 1000) {
                    clearInterval(timeoutId);
                    timeBetweenEnemies -= 1000;
                    timeoutId = setInterval(makeEnemy, timeBetweenEnemies);
                } else if (score % 5 === 0) {
                    enemyBaseSpeed += 1;
                }
            }
        });
        // Collide with the wall
        if (bullet.x > canvas.width) {
            shooting = false;
        }
        // Draw the bullet
        context.fillStyle = '#0000FF';
        bullet.draw();
    }
    // Draw the score
    context.fillStyle = '#000000';
    context.font = '24px Arial';
    context.textAlign = 'left';
    context.fillText('Score: ' + score, 1, 25)
    // End or continue the game
    if (gameOver) {
        endGame();
    } else {
        window.requestAnimationFrame(draw);
    }
}

// Start the game
menu();
canvas.focus();
