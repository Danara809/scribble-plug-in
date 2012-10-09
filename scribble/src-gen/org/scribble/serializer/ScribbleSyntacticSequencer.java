package org.scribble.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.scribble.services.ScribbleGrammarAccess;

@SuppressWarnings("all")
public class ScribbleSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ScribbleGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ScribbleGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGTRule())
			return getGTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLCBRule())
			return getLCBToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARule())
			return getLPAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLTRule())
			return getLTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRCBRule())
			return getRCBToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARule())
			return getRPAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMIRule())
			return getSEMIToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal GT: '>';
	 */
	protected String getGTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal LCB: '{';
	 */
	protected String getLCBToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LPA: '(';
	 */
	protected String getLPAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal LT: '<';
	 */
	protected String getLTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal RCB: '}';
	 */
	protected String getRCBToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RPA: ')';
	 */
	protected String getRPAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEMI: ';';
	 */
	protected String getSEMIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
