package dk.itu.mario.level;

import java.util.Random;

import dk.itu.mario.MarioInterface.Constraints;
import dk.itu.mario.MarioInterface.GamePlay;
import dk.itu.mario.MarioInterface.LevelInterface;
import dk.itu.mario.engine.sprites.SpriteTemplate;
import dk.itu.mario.engine.sprites.Enemy;

public class MyLevel extends Level
{
    private static long lastSeed;
    private static Random levelSeedRandom;

    private int difficulty;
    private int type;

    public MyLevel(int width, int height)
    {
        super(width, height);
    }

    public MyLevel(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
    {
        this(width, height);
        this.difficulty = difficulty;
        this.type = type;
        lastSeed = seed;
        levelSeedRandom = new Random(seed);

        setBlock(0, 5, BLOCK_EMPTY);
        setBlock(0, 4, BLOCK_EMPTY);
        setBlock(1, 5, BLOCK_EMPTY);
        setBlock(1, 4, BLOCK_EMPTY);
        setBlock(2, 5, BLOCK_EMPTY);
        setBlock(2, 4, BLOCK_EMPTY);
        setBlock(3, 5, BLOCK_EMPTY);
        setBlock(3, 4, BLOCK_EMPTY);
        setBlock(4, 6, BLOCK_EMPTY);
        setBlock(4, 5, BLOCK_EMPTY);
        setBlock(5, 6, BLOCK_EMPTY);
        setBlock(5, 5, BLOCK_EMPTY);
        setBlock(6, 6, BLOCK_EMPTY);
        setBlock(6, 5, BLOCK_EMPTY);
        setBlock(7, 6, BLOCK_EMPTY);
        setBlock(7, 5, BLOCK_EMPTY);
        setBlock(8, 6, BLOCK_EMPTY);
        setBlock(8, 5, BLOCK_EMPTY);
        setBlock(9, 6, BLOCK_EMPTY);
        setBlock(9, 5, BLOCK_EMPTY);
        setBlock(10, 7, BLOCK_EMPTY);
        setBlock(10, 6, BLOCK_EMPTY);
        setBlock(11, 7, BLOCK_EMPTY);
        setBlock(11, 6, BLOCK_EMPTY);
        setBlock(12, 7, BLOCK_EMPTY);
        setBlock(12, 6, BLOCK_EMPTY);
        setBlock(13, 7, BLOCK_EMPTY);
        setBlock(13, 6, BLOCK_EMPTY);
        setBlock(14, 8, BLOCK_EMPTY);
        setBlock(14, 7, BLOCK_EMPTY);
        setBlock(15, 8, BLOCK_EMPTY);
        setBlock(15, 7, BLOCK_EMPTY);
        setBlock(16, 9, BLOCK_EMPTY);
        setBlock(16, 8, BLOCK_EMPTY);
        setBlock(17, 9, BLOCK_EMPTY);
        setBlock(17, 8, BLOCK_EMPTY);
        setBlock(18, 9, BLOCK_EMPTY);
        setBlock(18, 8, BLOCK_EMPTY);
        setBlock(19, 9, BLOCK_EMPTY);
        setBlock(19, 8, BLOCK_EMPTY);
        setBlock(20, 10, BLOCK_EMPTY);
        setBlock(20, 9, BLOCK_EMPTY);
        setBlock(21, 10, BLOCK_EMPTY);
        setBlock(21, 9, BLOCK_EMPTY);
        setBlock(22, 10, BLOCK_EMPTY);
        setBlock(22, 9, BLOCK_EMPTY);
        setBlock(23, 10, BLOCK_EMPTY);
        setBlock(23, 9, BLOCK_EMPTY);
        setBlock(24, 11, BLOCK_EMPTY);
        setBlock(24, 10, BLOCK_EMPTY);
        setBlock(25, 11, BLOCK_EMPTY);
        setBlock(25, 10, BLOCK_EMPTY);
        setBlock(26, 11, BLOCK_EMPTY);
        setBlock(26, 10, BLOCK_EMPTY);
        setBlock(27, 11, BLOCK_EMPTY);
        setBlock(27, 10, BLOCK_EMPTY);
        setBlock(28, 11, BLOCK_EMPTY);
        setBlock(28, 10, BLOCK_EMPTY);
        setBlock(29, 11, BLOCK_EMPTY);
        setBlock(29, 10, BLOCK_EMPTY);
        setBlock(30, 12, BLOCK_EMPTY);
        setBlock(30, 11, BLOCK_EMPTY);
        setBlock(31, 12, BLOCK_EMPTY);
        setBlock(31, 11, BLOCK_EMPTY);
        setBlock(32, 12, BLOCK_EMPTY);
        setBlock(32, 11, BLOCK_EMPTY);
        setBlock(33, 12, BLOCK_EMPTY);
        setBlock(33, 11, BLOCK_EMPTY);
        setBlock(34, 12, BLOCK_EMPTY);
        setBlock(34, 11, BLOCK_EMPTY);
        setBlock(35, 12, BLOCK_EMPTY);
        setBlock(35, 11, BLOCK_EMPTY);
        setBlock(36, 12, BLOCK_EMPTY);
        setBlock(36, 11, BLOCK_EMPTY);
        setBlock(37, 12, BLOCK_EMPTY);
        setBlock(37, 11, BLOCK_EMPTY);
        setBlock(38, 12, BLOCK_EMPTY);
        setBlock(38, 11, BLOCK_EMPTY);
        setBlock(39, 12, BLOCK_EMPTY);
        setBlock(39, 11, BLOCK_EMPTY);
        setBlock(40, 12, BLOCK_EMPTY);
        setBlock(40, 11, BLOCK_EMPTY);
        setBlock(41, 12, BLOCK_EMPTY);
        setBlock(41, 11, BLOCK_EMPTY);
        setBlock(42, 12, BLOCK_EMPTY);
        setBlock(42, 11, BLOCK_EMPTY);
        setBlock(43, 12, BLOCK_EMPTY);
        setBlock(43, 11, BLOCK_EMPTY);
        setBlock(44, 12, BLOCK_EMPTY);
        setBlock(44, 11, BLOCK_EMPTY);
        setBlock(45, 12, BLOCK_EMPTY);
        setBlock(45, 11, BLOCK_EMPTY);
        setBlock(46, 12, BLOCK_EMPTY);
        setBlock(46, 11, BLOCK_EMPTY);
        setBlock(47, 12, BLOCK_EMPTY);
        setBlock(47, 11, BLOCK_EMPTY);
        setBlock(48, 12, BLOCK_EMPTY);
        setBlock(48, 11, BLOCK_EMPTY);
        setBlock(49, 12, BLOCK_EMPTY);
        setBlock(49, 11, BLOCK_EMPTY);
        setBlock(50, 12, BLOCK_EMPTY);
        setBlock(50, 11, BLOCK_EMPTY);
        setBlock(51, 12, BLOCK_EMPTY);
        setBlock(51, 11, BLOCK_EMPTY);
        setBlock(52, 11, BLOCK_EMPTY);
        setBlock(52, 10, BLOCK_EMPTY);
        setBlock(53, 11, BLOCK_EMPTY);
        setBlock(53, 10, BLOCK_EMPTY);
        setBlock(54, 11, BLOCK_EMPTY);
        setBlock(54, 10, BLOCK_EMPTY);
        setBlock(55, 11, BLOCK_EMPTY);
        setBlock(55, 10, BLOCK_EMPTY);
        setBlock(56, 11, BLOCK_EMPTY);
        setBlock(56, 10, BLOCK_EMPTY);
        setBlock(57, 11, BLOCK_EMPTY);
        setBlock(57, 10, BLOCK_EMPTY);
        setBlock(58, 11, BLOCK_EMPTY);
        setBlock(58, 10, BLOCK_EMPTY);
        setBlock(59, 11, BLOCK_EMPTY);
        setBlock(59, 10, BLOCK_EMPTY);
        setBlock(60, 11, BLOCK_EMPTY);
        setBlock(60, 10, BLOCK_EMPTY);
        setBlock(61, 11, BLOCK_EMPTY);
        setBlock(61, 10, BLOCK_EMPTY);
        setBlock(62, 10, BLOCK_EMPTY);
        setBlock(62, 9, BLOCK_EMPTY);
        setBlock(63, 10, BLOCK_EMPTY);
        setBlock(63, 9, BLOCK_EMPTY);
        setBlock(64, 10, BLOCK_EMPTY);
        setBlock(64, 9, BLOCK_EMPTY);
        setBlock(65, 10, BLOCK_EMPTY);
        setBlock(65, 9, BLOCK_EMPTY);
        setBlock(66, 9, BLOCK_EMPTY);
        setBlock(66, 8, BLOCK_EMPTY);
        setBlock(67, 9, BLOCK_EMPTY);
        setBlock(67, 8, BLOCK_EMPTY);
        setBlock(61, 2, COIN);
        setBlock(61, 1, COIN);
        setBlock(62, 2, COIN);
        setBlock(62, 1, COIN);
        setBlock(63, 2, COIN);
        setBlock(63, 1, COIN);
        setBlock(64, 2, COIN);
        setBlock(64, 1, COIN);
        setBlock(65, 2, COIN);
        setBlock(65, 1, COIN);
        setBlock(66, 2, COIN);
        setBlock(66, 1, COIN);
        setBlock(67, 2, COIN);
        setBlock(67, 1, COIN);
        setBlock(68, 2, COIN);
        setBlock(68, 1, COIN);
        setBlock(69, 2, COIN);
        setBlock(69, 1, COIN);
        setBlock(70, 2, COIN);
        setBlock(70, 1, COIN);
        setBlock(71, 2, COIN);
        setBlock(71, 1, COIN);
        setBlock(72, 2, COIN);
        setBlock(72, 1, COIN);
        setBlock(73, 2, COIN);
        setBlock(73, 1, COIN);
        setBlock(74, 2, COIN);
        setBlock(74, 1, COIN);
        setBlock(75, 2, COIN);
        setBlock(75, 1, COIN);
        setBlock(76, 2, COIN);
        setBlock(76, 1, COIN);
        setBlock(77, 2, COIN);
        setBlock(77, 1, COIN);
        setBlock(78, 2, COIN);
        setBlock(78, 1, COIN);
        setBlock(59, 2, COIN);
        setBlock(59, 1, COIN);
        setBlock(60, 2, COIN);
        setBlock(60, 1, COIN);
        setBlock(57, 2, COIN);
        setBlock(57, 1, COIN);
        setBlock(58, 2, COIN);
        setBlock(58, 1, COIN);
        setBlock(89, 11, BLOCK_EMPTY);
        setBlock(90, 11, BLOCK_EMPTY);
        setBlock(91, 11, BLOCK_EMPTY);
        setBlock(92, 11, BLOCK_EMPTY);
        setBlock(93, 11, BLOCK_EMPTY);
        setBlock(94, 11, BLOCK_EMPTY);
        setBlock(83, 11, BLOCK_EMPTY);
        setBlock(84, 11, BLOCK_EMPTY);
        setBlock(85, 11, BLOCK_EMPTY);
        setBlock(86, 11, BLOCK_EMPTY);
        setBlock(87, 11, BLOCK_EMPTY);
        setBlock(88, 11, BLOCK_EMPTY);
        setBlock(71, 10, BLOCK_EMPTY);
        setBlock(71, 9, BLOCK_EMPTY);
        setBlock(72, 10, BLOCK_EMPTY);
        setBlock(72, 9, BLOCK_EMPTY);
        setSpriteTemplate(27, 9, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
        setBlock(19, 1, BLOCK_EMPTY);
        setBlock(19, 0, BLOCK_EMPTY);
        setBlock(20, 1, BLOCK_EMPTY);
        setBlock(20, 0, BLOCK_EMPTY);
        setSpriteTemplate(11, 5, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
        setSpriteTemplate(38, 10, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
        setBlock(77, 11, BLOCK_EMPTY);
        setBlock(78, 11, BLOCK_EMPTY);
        setBlock(79, 11, BLOCK_EMPTY);
        setBlock(80, 11, BLOCK_EMPTY);
        setBlock(81, 11, BLOCK_EMPTY);
        setBlock(82, 11, BLOCK_EMPTY);
        setBlock(6, 12, GROUND);
        setBlock(6, 11, GROUND);
        setBlock(6, 10, GROUND);
        setBlock(7, 12, GROUND);
        setBlock(7, 11, GROUND);
        setBlock(7, 10, GROUND);
        setBlock(4, 10, GROUND);
        setBlock(4, 9, GROUND);
        setBlock(4, 8, GROUND);
        setBlock(5, 10, GROUND);
        setBlock(5, 9, GROUND);
        setBlock(5, 8, GROUND);
        setBlock(2, 10, GROUND);
        setBlock(2, 9, GROUND);
        setBlock(2, 8, GROUND);
        setBlock(3, 10, GROUND);
        setBlock(3, 9, GROUND);
        setBlock(3, 8, GROUND);
        setBlock(2, 8, HILL_TOP);
        setBlock(3, 8, HILL_TOP);
        setBlock(4, 8, HILL_TOP);
        setBlock(5, 8, HILL_TOP);
        setBlock(6, 10, HILL_TOP);
        setBlock(7, 10, HILL_TOP);

        xExit = 93;
        yExit = 11;
    }
}