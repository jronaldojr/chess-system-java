package chess;

import bordegame.BoardExecption;

public class ChessException extends BoardExecption {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
