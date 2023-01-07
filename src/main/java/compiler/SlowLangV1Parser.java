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
		STRING_TYPE=10, PRINT=11, INT=12, FLOAT=13, STRING=14, ID=15, WS=16, ASSIGN=17, 
		OR=18, AND=19, EQ=20, NE=21, LT=22, GT=23, LE=24, GE=25, PLUS=26, MINUS=27, 
		MULT=28, DIV=29, MOD=30, NOT=31, BIT_NOT=32, INCR=33, DECR=34, LPAREN=35, 
		RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, RBRACK=40, SEMI=41, COMMA=42, 
		DOT=43;
	public static final int
		RULE_program = 0, RULE_mainExecBlock = 1, RULE_classDecl = 2, RULE_classBody = 3, 
		RULE_fieldDecl = 4, RULE_methodDecl = 5, RULE_formalParams = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, RULE_returnStatement = 11, 
		RULE_printStatement = 12, RULE_expression = 13, RULE_logicalOrExpr = 14, 
		RULE_logicalAndExpr = 15, RULE_equalityExpr = 16, RULE_relationalExpr = 17, 
		RULE_additiveExpr = 18, RULE_multiplicativeExpr = 19, RULE_unaryExpr = 20, 
		RULE_assignmentExpr = 21, RULE_objectMethodCall = 22, RULE_functionCall = 23, 
		RULE_primaryExpr = 24, RULE_prefixIncrDerc = 25, RULE_postfixIncrDerc = 26, 
		RULE_objectCreation = 27, RULE_type = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainExecBlock", "classDecl", "classBody", "fieldDecl", "methodDecl", 
			"formalParams", "block", "statement", "ifStatement", "whileStatement", 
			"returnStatement", "printStatement", "expression", "logicalOrExpr", "logicalAndExpr", 
			"equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "assignmentExpr", "objectMethodCall", "functionCall", "primaryExpr", 
			"prefixIncrDerc", "postfixIncrDerc", "objectCreation", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'main'", "'if'", "'else'", "'while'", "'return'", "'new'", 
			"'int'", "'float'", "'string'", "'print'", null, null, null, null, null, 
			"'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'++'", "'--'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "MAIN", "IF", "ELSE", "WHILE", "RETURN", "NEW", "INT_TYPE", 
			"FLOAT_TYPE", "STRING_TYPE", "PRINT", "INT", "FLOAT", "STRING", "ID", 
			"WS", "ASSIGN", "OR", "AND", "EQ", "NE", "LT", "GT", "LE", "GE", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "NOT", "BIT_NOT", "INCR", "DECR", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(58);
				mainExecBlock();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(61);
				classDecl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(69);
			match(MAIN);
			setState(70);
			match(LBRACE);
			setState(71);
			block();
			setState(72);
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
			setState(74);
			match(CLASS);
			setState(75);
			match(ID);
			setState(76);
			match(LBRACE);
			setState(77);
			classBody();
			setState(78);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(80);
					fieldDecl();
					}
					break;
				case 2:
					{
					setState(81);
					methodDecl();
					}
					break;
				}
				}
				setState(86);
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
			setState(87);
			type();
			setState(88);
			match(ID);
			setState(89);
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
			setState(91);
			type();
			setState(92);
			match(ID);
			setState(93);
			match(LPAREN);
			setState(94);
			formalParams();
			setState(95);
			match(RPAREN);
			setState(96);
			match(LBRACE);
			setState(97);
			block();
			setState(98);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				setState(100);
				type();
				setState(101);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(102);
					match(COMMA);
					setState(103);
					type();
					setState(104);
					match(ID);
					}
					}
					setState(110);
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << NEW) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
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
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				whileStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				returnStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				printStatement();
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
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				expression();
				setState(124);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(LBRACE);
				setState(128);
				block();
				setState(129);
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
			setState(133);
			match(IF);
			setState(134);
			match(LPAREN);
			setState(135);
			expression();
			setState(136);
			match(RPAREN);
			setState(137);
			statement();
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(138);
				match(ELSE);
				setState(139);
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
			setState(142);
			match(WHILE);
			setState(143);
			match(LPAREN);
			setState(144);
			expression();
			setState(145);
			match(RPAREN);
			setState(146);
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
			setState(148);
			match(RETURN);
			setState(149);
			expression();
			setState(150);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SlowLangV1Parser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(SlowLangV1Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlowLangV1Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SlowLangV1Parser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlowLangV1ParserListener ) ((SlowLangV1ParserListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PRINT);
			setState(153);
			match(LPAREN);
			setState(154);
			expression();
			setState(155);
			match(RPAREN);
			setState(156);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				logicalOrExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				assignmentExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				objectMethodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
		enterRule(_localctx, 28, RULE_logicalOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			logicalAndExpr();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(165);
				match(OR);
				setState(166);
				logicalAndExpr();
				}
				}
				setState(171);
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
		enterRule(_localctx, 30, RULE_logicalAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			equalityExpr();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(173);
				match(AND);
				setState(174);
				equalityExpr();
				}
				}
				setState(179);
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
		enterRule(_localctx, 32, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			relationalExpr();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				relationalExpr();
				}
				}
				setState(187);
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
		enterRule(_localctx, 34, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			additiveExpr();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				additiveExpr();
				}
				}
				setState(195);
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
		enterRule(_localctx, 36, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			multiplicativeExpr();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				multiplicativeExpr();
				}
				}
				setState(203);
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
		enterRule(_localctx, 38, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			unaryExpr();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				unaryExpr();
				}
				}
				setState(211);
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
		enterRule(_localctx, 40, RULE_unaryExpr);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case BIT_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
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
				setState(214);
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
		enterRule(_localctx, 42, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			primaryExpr();
			setState(218);
			match(ASSIGN);
			setState(219);
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
		enterRule(_localctx, 44, RULE_objectMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			primaryExpr();
			setState(222);
			match(DOT);
			setState(223);
			match(ID);
			setState(224);
			match(LPAREN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(225);
				expression();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(226);
					match(COMMA);
					setState(227);
					expression();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(235);
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
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(LPAREN);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(239);
				expression();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(240);
					match(COMMA);
					setState(241);
					expression();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(249);
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
		enterRule(_localctx, 48, RULE_primaryExpr);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				objectCreation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(LPAREN);
				setState(257);
				expression();
				setState(258);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				prefixIncrDerc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
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
		enterRule(_localctx, 50, RULE_prefixIncrDerc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
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
		enterRule(_localctx, 52, RULE_postfixIncrDerc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
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
		enterRule(_localctx, 54, RULE_objectCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(NEW);
			setState(271);
			match(ID);
			setState(272);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << BIT_NOT) | (1L << INCR) | (1L << DECR) | (1L << LPAREN))) != 0)) {
				{
				setState(273);
				expression();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					expression();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5\b"+
		"r\n\b\3\t\7\tu\n\t\f\t\16\tx\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\20\3\20\3\20\7\20\u00aa\n"+
		"\20\f\20\16\20\u00ad\13\20\3\21\3\21\3\21\7\21\u00b2\n\21\f\21\16\21\u00b5"+
		"\13\21\3\22\3\22\3\22\7\22\u00ba\n\22\f\22\16\22\u00bd\13\22\3\23\3\23"+
		"\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23\3\24\3\24\3\24\7\24\u00ca"+
		"\n\24\f\24\16\24\u00cd\13\24\3\25\3\25\3\25\7\25\u00d2\n\25\f\25\16\25"+
		"\u00d5\13\25\3\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e7\n\30\f\30\16\30\u00ea\13\30\5"+
		"\30\u00ec\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u00f5\n\31\f\31"+
		"\16\31\u00f8\13\31\5\31\u00fa\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0109\n\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0117\n\35\f\35\16\35\u011a\13"+
		"\35\5\35\u011c\n\35\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\t\3\2\26\27\3\2\30\33\3"+
		"\2\34\35\3\2\36 \4\2\34\35!\"\3\2#$\4\2\n\f\21\21\2\u0129\2=\3\2\2\2\4"+
		"G\3\2\2\2\6L\3\2\2\2\bV\3\2\2\2\nY\3\2\2\2\f]\3\2\2\2\16q\3\2\2\2\20v"+
		"\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u0090\3\2\2\2\30\u0096\3"+
		"\2\2\2\32\u009a\3\2\2\2\34\u00a4\3\2\2\2\36\u00a6\3\2\2\2 \u00ae\3\2\2"+
		"\2\"\u00b6\3\2\2\2$\u00be\3\2\2\2&\u00c6\3\2\2\2(\u00ce\3\2\2\2*\u00d9"+
		"\3\2\2\2,\u00db\3\2\2\2.\u00df\3\2\2\2\60\u00ef\3\2\2\2\62\u0108\3\2\2"+
		"\2\64\u010a\3\2\2\2\66\u010d\3\2\2\28\u0110\3\2\2\2:\u011f\3\2\2\2<>\5"+
		"\4\3\2=<\3\2\2\2=>\3\2\2\2>B\3\2\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\2\2\3F\3\3\2\2\2GH\7\4\2\2HI"+
		"\7\'\2\2IJ\5\20\t\2JK\7(\2\2K\5\3\2\2\2LM\7\3\2\2MN\7\21\2\2NO\7\'\2\2"+
		"OP\5\b\5\2PQ\7(\2\2Q\7\3\2\2\2RU\5\n\6\2SU\5\f\7\2TR\3\2\2\2TS\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XV\3\2\2\2YZ\5:\36\2Z[\7\21\2"+
		"\2[\\\7+\2\2\\\13\3\2\2\2]^\5:\36\2^_\7\21\2\2_`\7%\2\2`a\5\16\b\2ab\7"+
		"&\2\2bc\7\'\2\2cd\5\20\t\2de\7(\2\2e\r\3\2\2\2fg\5:\36\2gn\7\21\2\2hi"+
		"\7,\2\2ij\5:\36\2jk\7\21\2\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2n"+
		"o\3\2\2\2or\3\2\2\2pn\3\2\2\2qf\3\2\2\2qr\3\2\2\2r\17\3\2\2\2su\5\22\n"+
		"\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y\u0086"+
		"\5\24\13\2z\u0086\5\26\f\2{\u0086\5\30\r\2|\u0086\5\32\16\2}~\5\34\17"+
		"\2~\177\7+\2\2\177\u0086\3\2\2\2\u0080\u0086\7+\2\2\u0081\u0082\7\'\2"+
		"\2\u0082\u0083\5\20\t\2\u0083\u0084\7(\2\2\u0084\u0086\3\2\2\2\u0085y"+
		"\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\7\5\2"+
		"\2\u0088\u0089\7%\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7&\2\2\u008b\u008e"+
		"\5\22\n\2\u008c\u008d\7\6\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\7\2\2\u0091\u0092"+
		"\7%\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7&\2\2\u0094\u0095\5\22\n\2"+
		"\u0095\27\3\2\2\2\u0096\u0097\7\b\2\2\u0097\u0098\5\34\17\2\u0098\u0099"+
		"\7+\2\2\u0099\31\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009c\7%\2\2\u009c"+
		"\u009d\5\34\17\2\u009d\u009e\7&\2\2\u009e\u009f\7+\2\2\u009f\33\3\2\2"+
		"\2\u00a0\u00a5\5\36\20\2\u00a1\u00a5\5,\27\2\u00a2\u00a5\5.\30\2\u00a3"+
		"\u00a5\5\60\31\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00ab\5 \21\2\u00a7"+
		"\u00a8\7\24\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b3\5\"\22\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\5"+
		"\"\22\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4!\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\5$\23\2"+
		"\u00b7\u00b8\t\2\2\2\u00b8\u00ba\5$\23\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc#\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0\t\3\2\2\u00c0\u00c2\5&"+
		"\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5(\25\2"+
		"\u00c7\u00c8\t\4\2\2\u00c8\u00ca\5(\25\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\'\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d3\5*\26\2\u00cf\u00d0\t\5\2\2\u00d0\u00d2\5*"+
		"\26\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4)\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\6\2\2"+
		"\u00d7\u00da\5*\26\2\u00d8\u00da\5\62\32\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da+\3\2\2\2\u00db\u00dc\5\62\32\2\u00dc\u00dd\7\23\2\2\u00dd"+
		"\u00de\5\34\17\2\u00de-\3\2\2\2\u00df\u00e0\5\62\32\2\u00e0\u00e1\7-\2"+
		"\2\u00e1\u00e2\7\21\2\2\u00e2\u00eb\7%\2\2\u00e3\u00e8\5\34\17\2\u00e4"+
		"\u00e5\7,\2\2\u00e5\u00e7\5\34\17\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7&\2\2\u00ee/\3\2\2\2\u00ef\u00f0\7\21\2\2\u00f0\u00f9"+
		"\7%\2\2\u00f1\u00f6\5\34\17\2\u00f2\u00f3\7,\2\2\u00f3\u00f5\5\34\17\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7&\2\2\u00fc\61\3\2\2\2"+
		"\u00fd\u0109\7\16\2\2\u00fe\u0109\7\17\2\2\u00ff\u0109\7\20\2\2\u0100"+
		"\u0109\7\21\2\2\u0101\u0109\58\35\2\u0102\u0103\7%\2\2\u0103\u0104\5\34"+
		"\17\2\u0104\u0105\7&\2\2\u0105\u0109\3\2\2\2\u0106\u0109\5\64\33\2\u0107"+
		"\u0109\5\66\34\2\u0108\u00fd\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u00ff\3"+
		"\2\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\63\3\2\2\2\u010a\u010b\t\7\2"+
		"\2\u010b\u010c\7\21\2\2\u010c\65\3\2\2\2\u010d\u010e\7\21\2\2\u010e\u010f"+
		"\t\7\2\2\u010f\67\3\2\2\2\u0110\u0111\7\t\2\2\u0111\u0112\7\21\2\2\u0112"+
		"\u011b\7%\2\2\u0113\u0118\5\34\17\2\u0114\u0115\7,\2\2\u0115\u0117\5\34"+
		"\17\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0113\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7&\2\2\u011e"+
		"9\3\2\2\2\u011f\u0120\t\b\2\2\u0120;\3\2\2\2\32=BTVnqv\u0085\u008e\u00a4"+
		"\u00ab\u00b3\u00bb\u00c3\u00cb\u00d3\u00d9\u00e8\u00eb\u00f6\u00f9\u0108"+
		"\u0118\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}