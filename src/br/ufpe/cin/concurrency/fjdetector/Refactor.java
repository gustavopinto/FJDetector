package br.ufpe.cin.concurrency.fjdetector;

import org.eclipse.jdt.core.dom.ASTNode;

public interface Refactor {

	void refactor(ASTNode node);
	
}
