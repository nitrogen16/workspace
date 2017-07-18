package main;

public class SpaceShip extends BaseObject {

	private double dx = 0;

	public SpaceShip(double x, double y) {
		super(x, y, 3);
	}

	/**
	 * Устанавливаем вектор движения влево
	 */
	public void moveLeft() {
		dx = -1;
	}

	/**
	 * Устанавливаем вектор движения вправо
	 */
	public void moveRight() {
		dx = 1;
	}

	/**
	 * Метод рисует свой объект на "канвасе".
	 */
	@Override
	public void draw(Canvas canvas) {

	}

	/**
	 * Двигаем себя на один ход. Проверяем столкновение с границами.
	 */
	@Override
	public void move() {
		x = x + dx;

		checkBorders(radius, Space.game.getWidth() - radius + 1, 1, Space.game.getHeight() + 1);
	}

	/**
	 * Стреляем. Создаем две ракеты: слева и справа от корабля.
	 */
	public void fire() {
		Rocket rocket1 = new Rocket(x-2,y);
		Rocket rocket2 = new Rocket(x+2,y);
		Space.game.getRockets().add(rocket1);
		Space.game.getRockets().add(rocket2);
	}

}