package compiler;

// Generated from SlowLangV1Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlowLangV1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, MAIN=2, IF=3, ELSE=4, WHILE=5, RETURN=6, NEW=7, INT_TYPE=8, FLOAT_TYPE=9, 
		STRING_TYPE=10, INT=11, FLOAT=12, STRING=13, ID=14, WS=15, ASSIGN=16, 
		OR=17, AND=18, EQ=19, NE=20, LT=21, GT=22, LE=23, GE=24, PLUS=25, MINUS=26, 
		MULT=27, DIV=28, MOD=29, NOT=30, BIT_NOT=31, INCR=32, DECR=33, LPAREN=34, 
		RPAREN=35, LBRACE=36, RBRACE=37, LBRACK=38, RBRACK=39, SEMI=40, COMMA=41, 
		DOT=42;
	public static final int
		RULE_program = 0, RULE_mainExecBlock = 1, RULE_classDecl = 2, RULE_classBody = 3, 
		RULE_fieldDecl = 4, RULE_methodDecl = 5, RULE_formalParams = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, RULE_returnStatement = 11, 
		RULE_expression = 12, RULE_logicalOrExpr = 13, RULE_logicalAndExpr = 14, 
		RULE_equalityExpr = 15, RULE_relationalExpr = 16, RULE_additiveExpr = 17, 
		RULE_multiplicativeExpr = 18, RULE_unaryExpr = 19, RULE_assignmentExpr = 20, 
		RULE_objectMethodCall = 21, RULE_functionCall = 22, RULE_primaryExpr = 23, 
		RULE_prefixIncrDerc = 24, RULE_postfixIncrDerc = 25, RULE_objectCreation = 26, 
		RULE_type = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainExecBlock", "classDecl", "classBody", "fieldDecl", "methodDecl", 
			"formalParams", "block", "statement", "ifStatement", "whileStatement", 
			"returnStatement", "expression", "logicalOrExpr", "logicalAndExpr", "equalityExpr", 
			"relationalExpr", "additiveExpr", "multiplicativeExpr", "unaryExpr", 
			"assignmentExpr", "objectMethodCall", "functionCall", "primaryExpr", 
			"prefixIncrDerc", "postfixIncrDerc", "objectCreation", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'main'", "'if'", "'else'", "'while'", "'return'", "'new'", 
			"'int'", "'float'", "'string'", null, null, null, null, null, "'='", 
			"'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "MAIN", "IF", "ELSE", "WHILE", "RETURN", "NEW", "INT_TYPE", 
			"FLOAT_TYPE", "STRING_TYPE", "INT", "FLOAT", "STRING", "ID", "WS", "ASSIGN", 
			"OR", "AND", "EQ", "NE", "LT", "GT", "LE", "GE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NOT", "BIT_NOT", "INCR", "DECR", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SlowLangV1Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlowLangV1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SlowLangV1Parser.EOF, 0); }
		public MainExecBlockContext mainExecBlock() {
			return getRuleContext(MainExecBlockContext.class,0);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(56);
				mainExecBlock();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(59);
				classDecl();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainExecBlockContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SlowLangV1Parser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(SlowLangV1Parser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SlowLangV1Parser.RBRACE, 0); }
		public MainExecBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainExecBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterMainExecBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitMainExecBlock(this);
		}
	}

	public final MainExecBlockContext mainExecBlock() throws RecognitionException {
		MainExecBlockContext _localctx = new MainExecBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainExecBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(MAIN);
			setState(68);
			match(LBRACE);
			setState(69);
			block();
			setState(70);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SlowLangV1Parser.CLASS, 0); }
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(SlowLangV1Parser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SlowLangV1Parser.RBRACE, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CLASS);
			setState(73);
			match(ID);
			setState(74);
			match(LBRACE);
			setState(75);
			classBody();
			setState(76);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(78);
					fieldDecl();
					}
					break;
				case 2:
					{
					setState(79);
					methodDecl();
					}
					break;
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SlowLangV1Parser.SEMI, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(86);
			match(ID);
			setState(87);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SlowLangV1Parser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SlowLangV1Parser.RBRACE, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			match(ID);
			setState(91);
			match(LPAREN);
			setState(92);
			formalParams();
			setState(93);
			match(RPAREN);
			setState(94);
			match(LBRACE);
			setState(95);
			block();
			setState(96);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SlowLangV1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SlowLangV1Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlowLangV1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlowLangV1Parser.COMMA, i);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterFormalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitFormalParams(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				setState(98);
				type();
				setState(99);
				match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					type();
					setState(102);
					match(ID);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SlowLangV1Parser.SEMI, 0); }
		public TerminalNode LBRACE() { return getToken(SlowLangV1Parser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SlowLangV1Parser.RBRACE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				returnStatement();
				}
				break;
			case NEW:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
			case PLUS:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INCR:
			case DECR:
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				expression();
				setState(121);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(LBRACE);
				setState(125);
				block();
				setState(126);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SlowLangV1Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SlowLangV1Parser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			match(LPAREN);
			setState(132);
			expression();
			setState(133);
			match(RPAREN);
			setState(134);
			statement();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(135);
				match(ELSE);
				setState(136);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SlowLangV1Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			match(LPAREN);
			setState(141);
			expression();
			setState(142);
			match(RPAREN);
			setState(143);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SlowLangV1Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SlowLangV1Parser.SEMI, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(RETURN);
			setState(146);
			expression();
			setState(147);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public ObjectMethodCallContext objectMethodCall() {
			return getRuleContext(ObjectMethodCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				logicalOrExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				assignmentExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				objectMethodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExprContext extends ParserRuleContext {
		public List<LogicalAndExprContext> logicalAndExpr() {
			return getRuleContexts(LogicalAndExprContext.class);
		}
		public LogicalAndExprContext logicalAndExpr(int i) {
			return getRuleContext(LogicalAndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SlowLangV1Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SlowLangV1Parser.OR, i);
		}
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitLogicalOrExpr(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			logicalAndExpr();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(156);
				match(OR);
				setState(157);
				logicalAndExpr();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SlowLangV1Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SlowLangV1Parser.AND, i);
		}
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitLogicalAndExpr(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			equalityExpr();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(164);
				match(AND);
				setState(165);
				equalityExpr();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(SlowLangV1Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(SlowLangV1Parser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(SlowLangV1Parser.NE); }
		public TerminalNode NE(int i) {
			return getToken(SlowLangV1Parser.NE, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitEqualityExpr(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			relationalExpr();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				relationalExpr();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(SlowLangV1Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SlowLangV1Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(SlowLangV1Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SlowLangV1Parser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(SlowLangV1Parser.LE); }
		public TerminalNode LE(int i) {
			return getToken(SlowLangV1Parser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(SlowLangV1Parser.GE); }
		public TerminalNode GE(int i) {
			return getToken(SlowLangV1Parser.GE, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			additiveExpr();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				additiveExpr();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SlowLangV1Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SlowLangV1Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SlowLangV1Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SlowLangV1Parser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitAdditiveExpr(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			multiplicativeExpr();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				multiplicativeExpr();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SlowLangV1Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SlowLangV1Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SlowLangV1Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SlowLangV1Parser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SlowLangV1Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SlowLangV1Parser.MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitMultiplicativeExpr(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			unaryExpr();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(196);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(197);
				unaryExpr();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SlowLangV1Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SlowLangV1Parser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SlowLangV1Parser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(SlowLangV1Parser.BIT_NOT, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpr);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case BIT_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				unaryExpr();
				}
				break;
			case NEW:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
			case INCR:
			case DECR:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				primaryExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SlowLangV1Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitAssignmentExpr(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			primaryExpr();
			setState(209);
			match(ASSIGN);
			setState(210);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectMethodCallContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SlowLangV1Parser.DOT, 0); }
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlowLangV1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlowLangV1Parser.COMMA, i);
		}
		public ObjectMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterObjectMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitObjectMethodCall(this);
		}
	}

	public final ObjectMethodCallContext objectMethodCall() throws RecognitionException {
		ObjectMethodCallContext _localctx = new ObjectMethodCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			primaryExpr();
			setState(213);
			match(DOT);
			setState(214);
			match(ID);
			setState(215);
			match(LPAREN);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(216);
				expression();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					expression();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlowLangV1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlowLangV1Parser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			match(LPAREN);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(230);
				expression();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					expression();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SlowLangV1Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SlowLangV1Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SlowLangV1Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public ObjectCreationContext objectCreation() {
			return getRuleContext(ObjectCreationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public PrefixIncrDercContext prefixIncrDerc() {
			return getRuleContext(PrefixIncrDercContext.class,0);
		}
		public PostfixIncrDercContext postfixIncrDerc() {
			return getRuleContext(PostfixIncrDercContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primaryExpr);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				objectCreation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(LPAREN);
				setState(248);
				expression();
				setState(249);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				prefixIncrDerc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				postfixIncrDerc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixIncrDercContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode INCR() { return getToken(SlowLangV1Parser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SlowLangV1Parser.DECR, 0); }
		public PrefixIncrDercContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixIncrDerc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterPrefixIncrDerc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitPrefixIncrDerc(this);
		}
	}

	public final PrefixIncrDercContext prefixIncrDerc() throws RecognitionException {
		PrefixIncrDercContext _localctx = new PrefixIncrDercContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prefixIncrDerc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixIncrDercContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode INCR() { return getToken(SlowLangV1Parser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SlowLangV1Parser.DECR, 0); }
		public PostfixIncrDercContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixIncrDerc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterPostfixIncrDerc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitPostfixIncrDerc(this);
		}
	}

	public final PostfixIncrDercContext postfixIncrDerc() throws RecognitionException {
		PostfixIncrDercContext _localctx = new PostfixIncrDercContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_postfixIncrDerc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectCreationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(SlowLangV1Parser.NEW, 0); }
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlowLangV1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlowLangV1Parser.COMMA, i);
		}
		public ObjectCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterObjectCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitObjectCreation(this);
		}
	}

	public final ObjectCreationContext objectCreation() throws RecognitionException {
		ObjectCreationContext _localctx = new ObjectCreationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_objectCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(NEW);
			setState(262);
			match(ID);
			setState(263);
			match(LPAREN);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(264);
				expression();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					expression();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(274);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(SlowLangV1Parser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(SlowLangV1Parser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(SlowLangV1Parser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(SlowLangV1Parser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\5\bp\n\b\3\t"+
		"\7\ts\n\t\f\t\16\tv\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0083\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u009c\n\16"+
		"\3\17\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20"+
		"\7\20\u00a9\n\20\f\20\16\20\u00ac\13\20\3\21\3\21\3\21\7\21\u00b1\n\21"+
		"\f\21\16\21\u00b4\13\21\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc"+
		"\13\22\3\23\3\23\3\23\7\23\u00c1\n\23\f\23\16\23\u00c4\13\23\3\24\3\24"+
		"\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24\3\25\3\25\3\25\5\25\u00d1"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00de"+
		"\n\27\f\27\16\27\u00e1\13\27\5\27\u00e3\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u00ec\n\30\f\30\16\30\u00ef\13\30\5\30\u00f1\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0100"+
		"\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u010e\n\34\f\34\16\34\u0111\13\34\5\34\u0113\n\34\3\34\3\34\3\35\3\35"+
		"\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\t\3\2\25\26\3\2\27\32\3\2\33\34\3\2\35\37\4\2\33\34 !\3\2\"#\4"+
		"\2\n\f\20\20\2\u0120\2;\3\2\2\2\4E\3\2\2\2\6J\3\2\2\2\bT\3\2\2\2\nW\3"+
		"\2\2\2\f[\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22\u0082\3\2\2\2\24\u0084\3"+
		"\2\2\2\26\u008d\3\2\2\2\30\u0093\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2"+
		"\2\2\36\u00a5\3\2\2\2 \u00ad\3\2\2\2\"\u00b5\3\2\2\2$\u00bd\3\2\2\2&\u00c5"+
		"\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d6\3\2\2\2.\u00e6\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0101\3\2\2\2\64\u0104\3\2\2\2\66\u0107\3\2\2\28\u0116"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\5\6\4\2>=\3\2\2\2?"+
		"B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\2\2\3D\3\3\2\2\2"+
		"EF\7\4\2\2FG\7&\2\2GH\5\20\t\2HI\7\'\2\2I\5\3\2\2\2JK\7\3\2\2KL\7\20\2"+
		"\2LM\7&\2\2MN\5\b\5\2NO\7\'\2\2O\7\3\2\2\2PS\5\n\6\2QS\5\f\7\2RP\3\2\2"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VT\3\2\2\2WX\58\35"+
		"\2XY\7\20\2\2YZ\7*\2\2Z\13\3\2\2\2[\\\58\35\2\\]\7\20\2\2]^\7$\2\2^_\5"+
		"\16\b\2_`\7%\2\2`a\7&\2\2ab\5\20\t\2bc\7\'\2\2c\r\3\2\2\2de\58\35\2el"+
		"\7\20\2\2fg\7+\2\2gh\58\35\2hi\7\20\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2od\3\2\2\2op\3\2\2\2p\17\3\2\2"+
		"\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3"+
		"\2\2\2w\u0083\5\24\13\2x\u0083\5\26\f\2y\u0083\5\30\r\2z{\5\32\16\2{|"+
		"\7*\2\2|\u0083\3\2\2\2}\u0083\7*\2\2~\177\7&\2\2\177\u0080\5\20\t\2\u0080"+
		"\u0081\7\'\2\2\u0081\u0083\3\2\2\2\u0082w\3\2\2\2\u0082x\3\2\2\2\u0082"+
		"y\3\2\2\2\u0082z\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\23\3\2\2"+
		"\2\u0084\u0085\7\5\2\2\u0085\u0086\7$\2\2\u0086\u0087\5\32\16\2\u0087"+
		"\u0088\7%\2\2\u0088\u008b\5\22\n\2\u0089\u008a\7\6\2\2\u008a\u008c\5\22"+
		"\n\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008e"+
		"\7\7\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7%\2\2\u0091"+
		"\u0092\5\22\n\2\u0092\27\3\2\2\2\u0093\u0094\7\b\2\2\u0094\u0095\5\32"+
		"\16\2\u0095\u0096\7*\2\2\u0096\31\3\2\2\2\u0097\u009c\5\34\17\2\u0098"+
		"\u009c\5*\26\2\u0099\u009c\5,\27\2\u009a\u009c\5.\30\2\u009b\u0097\3\2"+
		"\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\33\3\2\2\2\u009d\u00a2\5\36\20\2\u009e\u009f\7\23\2\2\u009f\u00a1\5\36"+
		"\20\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00aa\5 \21"+
		"\2\u00a6\u00a7\7\24\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\37\3\2\2"+
		"\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\"\22\2\u00ae\u00af\t\2\2\2\u00af"+
		"\u00b1\5\"\22\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ba"+
		"\5$\23\2\u00b6\u00b7\t\3\2\2\u00b7\u00b9\5$\23\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb#\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5&\24\2\u00be\u00bf\t\4\2\2\u00bf\u00c1"+
		"\5&\24\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\5(\25\2"+
		"\u00c6\u00c7\t\5\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\'\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00d1\5(\25\2\u00cf\u00d1\5\60"+
		"\31\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d3"+
		"\5\60\31\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\5\32\16\2\u00d5+\3\2\2\2\u00d6"+
		"\u00d7\5\60\31\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00e2\7"+
		"$\2\2\u00da\u00df\5\32\16\2\u00db\u00dc\7+\2\2\u00dc\u00de\5\32\16\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5-\3\2\2\2\u00e6"+
		"\u00e7\7\20\2\2\u00e7\u00f0\7$\2\2\u00e8\u00ed\5\32\16\2\u00e9\u00ea\7"+
		"+\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7%\2\2\u00f3/\3\2\2\2\u00f4\u0100\7\r\2\2\u00f5\u0100\7\16\2\2"+
		"\u00f6\u0100\7\17\2\2\u00f7\u0100\7\20\2\2\u00f8\u0100\5\66\34\2\u00f9"+
		"\u00fa\7$\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\7%\2\2\u00fc\u0100\3\2"+
		"\2\2\u00fd\u0100\5\62\32\2\u00fe\u0100\5\64\33\2\u00ff\u00f4\3\2\2\2\u00ff"+
		"\u00f5\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2"+
		"\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\61\3\2\2\2\u0101\u0102\t\7\2\2\u0102\u0103\7\20\2\2\u0103\63\3\2\2\2"+
		"\u0104\u0105\7\20\2\2\u0105\u0106\t\7\2\2\u0106\65\3\2\2\2\u0107\u0108"+
		"\7\t\2\2\u0108\u0109\7\20\2\2\u0109\u0112\7$\2\2\u010a\u010f\5\32\16\2"+
		"\u010b\u010c\7+\2\2\u010c\u010e\5\32\16\2\u010d\u010b\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\7%\2\2\u0115\67\3\2\2\2\u0116\u0117\t\b\2\2\u01179\3"+
		"\2\2\2\32;@RTlot\u0082\u008b\u009b\u00a2\u00aa\u00b2\u00ba\u00c2\u00ca"+
		"\u00d0\u00df\u00e2\u00ed\u00f0\u00ff\u010f\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}