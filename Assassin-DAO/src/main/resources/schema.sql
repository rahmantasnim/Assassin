CREATE TABLE IF NOT EXISTS `games` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `start` DATETIME NOT NULL,
    `end` DATETIME NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `users` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(30) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `players` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `user_id` INT NOT NULL,
    `game_id` INT NOT NULL,
    `alive` BOOLEAN NOT NULL,
    `target_id` INT NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `users`(`id`),
    FOREIGN KEY (`game_id`) REFERENCES `games`(`id`),
    FOREIGN KEY (`target_id`) REFERENCES `players`(`id`)
);

CREATE TABLE IF NOT EXISTS `kills` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `game_id` INT NOT NULL,
    `killer_id` INT NOT NULL,
    `killed_id` INT NOT NULL,
    `time` DATETIME NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`game_id`) REFERENCES `games`(`id`),
    FOREIGN KEY (`killer_id`) REFERENCES `players`(`id`),
    FOREIGN KEY (`killed_id`) REFERENCES `players`(`id`)
);
