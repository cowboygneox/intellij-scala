/* The following code was generated by JFlex 1.4.3 on 01.08.14 17:55 */

/*
 * Copyright 2000-2008 JetBrains s.r.o.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.plugins.scala.lang.scaladoc.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 01.08.14 17:55 from the specification file
 * <tt>../../scaladoc/lexer/scaladoc.flex</tt>
 */
public class _ScalaDocLexer implements FlexLexer, ScalaDocTokenType, ScalaTokenTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INNER_CODE_WHITESPACE = 40;
  public static final int CODE_BAD_LINK = 32;
  public static final int COMMENT_DATA = 4;
  public static final int PARAM_DOC_TAG_VALUE = 16;
  public static final int COMMENT_DATA_START = 2;
  public static final int DOC_TAG_VALUE_IN_PAREN = 20;
  public static final int PARAM_DOC_THROWS_TAG_VALUE = 18;
  public static final int CODE_LINK_INNER = 30;
  public static final int HTTP_LINK_INNER = 34;
  public static final int DOC_TAG_VALUE = 14;
  public static final int INLINE_TAG_NAME = 24;
  public static final int PARAM_TAG_DOC_SPACE = 8;
  public static final int DOC_TAG_VALUE_IN_LTGT = 22;
  public static final int PARAM_THROWS_TAG_DOC_SPACE = 10;
  public static final int COMMENT_INNER_CODE = 38;
  public static final int DOC_TAG_VALUE_SPACE = 36;
  public static final int YYINITIAL = 0;
  public static final int PARAM_TAG_SPACE = 12;
  public static final int TAG_DOC_SPACE = 6;
  public static final int INLINE_DOC_TAG_VALUE = 26;
  public static final int INLINE_TAG_DOC_SPACE = 28;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10,  6,  6, 11, 11, 12, 12, 13, 13, 14, 14, 
    15, 15,  6,  6, 16, 16, 17, 17, 18, 18
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\20\1\2\1\1\1\0\1\2\1\1\16\20\4\0\1\2\1\6"+
    "\1\17\1\7\1\30\2\6\1\23\1\37\1\40\1\10\1\6\1\24"+
    "\1\11\1\5\1\15\10\3\2\3\1\13\1\0\1\6\1\27\1\6"+
    "\1\6\1\41\32\4\1\25\1\14\1\36\1\12\1\21\1\22\1\45"+
    "\6\4\1\32\4\4\1\46\1\4\1\43\1\34\1\4\1\42\1\35"+
    "\1\33\2\4\1\44\3\4\1\26\1\6\1\31\1\6\6\20\1\16"+
    "\32\20\2\0\4\4\2\6\1\0\1\6\1\4\1\0\1\6\1\20"+
    "\1\6\1\0\1\6\1\6\3\0\1\4\1\6\3\0\1\4\5\0"+
    "\27\4\1\6\37\4\1\6\u01ca\4\4\0\14\4\16\0\5\4\7\0"+
    "\1\4\1\0\1\4\21\0\160\20\5\4\1\0\2\4\2\0\4\4"+
    "\10\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4\1\0\123\4"+
    "\1\6\213\4\1\6\5\20\2\0\236\4\11\0\46\4\2\0\1\4"+
    "\7\0\47\4\11\0\55\20\1\0\1\20\1\0\2\20\1\0\2\20"+
    "\1\0\1\20\10\0\33\4\5\0\3\4\15\0\4\20\2\0\3\6"+
    "\2\0\1\4\2\0\2\6\13\20\5\0\53\4\37\20\4\0\2\4"+
    "\1\20\143\4\1\0\1\4\10\20\1\6\6\20\2\4\2\20\1\6"+
    "\4\20\2\4\12\20\3\4\2\6\1\4\17\0\1\20\1\4\1\20"+
    "\36\4\33\20\2\0\131\4\13\20\1\4\16\0\12\20\41\4\11\20"+
    "\2\4\1\6\3\0\1\4\5\0\26\4\4\20\1\4\11\20\1\4"+
    "\3\20\1\4\5\20\22\0\31\4\3\20\244\0\4\20\66\4\3\20"+
    "\1\4\22\20\1\4\7\20\12\4\2\20\2\0\12\20\1\0\7\4"+
    "\1\0\7\4\1\0\3\20\1\0\10\4\2\0\2\4\2\0\26\4"+
    "\1\0\7\4\1\0\1\4\3\0\4\4\2\0\1\20\1\4\7\20"+
    "\2\0\2\20\2\0\3\20\1\4\10\0\1\20\4\0\2\4\1\0"+
    "\3\4\2\20\2\0\12\20\4\4\6\0\1\6\1\4\5\0\3\20"+
    "\1\0\6\4\4\0\2\4\2\0\26\4\1\0\7\4\1\0\2\4"+
    "\1\0\2\4\1\0\2\4\2\0\1\20\1\0\5\20\4\0\2\20"+
    "\2\0\3\20\3\0\1\20\7\0\4\4\1\0\1\4\7\0\14\20"+
    "\3\4\1\20\13\0\3\20\1\0\11\4\1\0\3\4\1\0\26\4"+
    "\1\0\7\4\1\0\2\4\1\0\5\4\2\0\1\20\1\4\10\20"+
    "\1\0\3\20\1\0\3\20\2\0\1\4\17\0\2\4\2\20\2\0"+
    "\12\20\1\0\1\4\17\0\3\20\1\0\10\4\2\0\2\4\2\0"+
    "\26\4\1\0\7\4\1\0\2\4\1\0\5\4\2\0\1\20\1\4"+
    "\7\20\2\0\2\20\2\0\3\20\10\0\2\20\4\0\2\4\1\0"+
    "\3\4\2\20\2\0\12\20\1\6\1\4\20\0\1\20\1\4\1\0"+
    "\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1\0"+
    "\2\4\3\0\2\4\3\0\3\4\3\0\14\4\4\0\5\20\3\0"+
    "\3\20\1\0\4\20\2\0\1\4\6\0\1\20\16\0\12\20\3\0"+
    "\6\6\1\4\1\6\6\0\3\20\1\0\10\4\1\0\3\4\1\0"+
    "\27\4\1\0\12\4\1\0\5\4\3\0\1\4\7\20\1\0\3\20"+
    "\1\0\4\20\7\0\2\20\1\0\2\4\6\0\2\4\2\20\2\0"+
    "\12\20\17\0\1\6\2\0\2\20\1\0\10\4\1\0\3\4\1\0"+
    "\27\4\1\0\12\4\1\0\5\4\2\0\1\20\1\4\7\20\1\0"+
    "\3\20\1\0\4\20\7\0\2\20\7\0\1\4\1\0\2\4\2\20"+
    "\2\0\12\20\1\0\2\4\17\0\2\20\1\0\10\4\1\0\3\4"+
    "\1\0\51\4\2\0\1\4\7\20\1\0\3\20\1\0\4\20\1\4"+
    "\10\0\1\20\10\0\2\4\2\20\2\0\12\20\11\0\1\6\6\4"+
    "\2\0\2\20\1\0\22\4\3\0\30\4\1\0\11\4\1\0\1\4"+
    "\2\0\7\4\3\0\1\20\4\0\6\20\1\0\1\20\1\0\10\20"+
    "\22\0\2\20\15\0\60\4\1\20\2\4\7\20\4\0\10\4\10\20"+
    "\1\0\12\20\47\0\2\4\1\0\1\4\2\0\2\4\1\0\1\4"+
    "\2\0\1\4\6\0\4\4\1\0\7\4\1\0\3\4\1\0\1\4"+
    "\1\0\1\4\2\0\2\4\1\0\4\4\1\20\2\4\6\20\1\0"+
    "\2\20\1\4\2\0\5\4\1\0\1\4\1\0\6\20\2\0\12\20"+
    "\2\0\2\4\42\0\1\4\3\6\17\0\5\6\2\20\6\6\12\20"+
    "\12\0\1\6\1\20\1\6\1\20\1\6\1\20\4\0\2\20\10\4"+
    "\1\0\44\4\4\0\24\20\1\0\2\20\5\4\13\20\1\0\44\20"+
    "\1\0\10\6\1\20\6\6\1\0\2\6\5\0\4\6\47\0\53\4"+
    "\24\20\1\4\12\20\6\0\6\4\4\20\4\4\3\20\1\4\3\20"+
    "\2\4\7\20\3\4\4\20\15\4\14\20\1\4\17\20\2\6\46\4"+
    "\12\0\53\4\1\0\1\4\3\0\u0149\4\1\0\4\4\2\0\7\4"+
    "\1\0\1\4\1\0\4\4\2\0\51\4\1\0\4\4\2\0\41\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\17\4"+
    "\1\0\71\4\1\0\4\4\2\0\103\4\2\0\3\20\1\6\37\0"+
    "\20\4\12\6\6\0\125\4\14\0\u026c\4\2\0\21\4\1\0\32\4"+
    "\5\0\113\4\3\0\3\4\17\0\15\4\1\0\4\4\3\20\13\0"+
    "\22\4\3\20\13\0\22\4\2\20\14\0\15\4\1\0\3\4\1\0"+
    "\2\20\14\0\64\4\40\20\3\0\1\4\3\0\2\4\1\20\2\0"+
    "\12\20\41\0\3\20\2\0\12\20\6\0\130\4\10\0\51\4\1\20"+
    "\1\4\5\0\106\4\12\0\35\4\3\0\14\20\4\0\14\20\4\0"+
    "\1\6\5\0\12\20\36\4\2\0\5\4\13\0\54\4\4\0\21\20"+
    "\7\4\2\20\6\0\12\20\4\0\42\6\27\4\5\20\4\0\65\4"+
    "\12\20\1\0\35\20\2\0\13\20\6\0\12\20\15\0\1\4\130\0"+
    "\5\20\57\4\21\20\7\4\4\0\12\20\7\0\12\6\11\20\11\6"+
    "\3\0\3\20\36\4\12\20\3\0\2\4\12\20\6\0\46\4\16\20"+
    "\14\0\44\4\24\20\10\0\12\20\3\0\3\4\12\20\44\4\122\0"+
    "\3\20\1\0\25\20\4\4\1\20\4\4\1\20\15\0\300\4\47\20"+
    "\25\0\4\20\u0116\4\2\0\6\4\2\0\46\4\2\0\6\4\2\0"+
    "\10\4\1\0\1\4\1\0\1\4\1\0\1\4\1\0\37\4\2\0"+
    "\65\4\1\0\7\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0"+
    "\4\4\2\0\6\4\4\0\15\4\5\0\3\4\1\0\7\4\16\0"+
    "\5\20\30\0\1\17\1\17\5\20\20\0\2\4\3\0\1\6\15\0"+
    "\1\6\1\0\1\4\13\0\5\20\5\0\6\20\1\0\1\4\10\0"+
    "\3\6\2\0\1\4\12\0\3\6\3\0\15\4\3\0\32\4\26\0"+
    "\15\20\4\0\1\20\3\0\14\20\17\0\2\6\1\4\4\6\1\4"+
    "\2\6\12\4\1\6\1\4\2\6\1\6\5\4\6\6\1\4\1\6"+
    "\1\4\1\6\1\4\1\6\4\4\1\6\13\4\2\6\4\4\5\6"+
    "\5\4\1\6\1\6\2\6\1\4\1\6\20\0\51\4\7\0\5\6"+
    "\5\6\2\6\4\6\1\6\2\6\1\6\2\6\1\6\7\6\1\6"+
    "\37\6\2\6\2\6\1\6\1\6\1\6\37\6\u010c\6\10\6\4\6"+
    "\24\6\2\6\7\6\2\0\121\6\1\6\36\6\31\6\50\6\6\6"+
    "\22\6\14\0\47\6\31\0\13\6\121\0\116\6\26\0\267\6\1\6"+
    "\11\6\1\6\66\6\10\6\157\6\1\6\220\6\1\0\147\6\54\0"+
    "\54\6\5\6\2\0\4\6\1\0\1\6\1\0\30\6\12\0\20\6"+
    "\u0100\6\203\6\26\0\77\6\4\0\40\6\2\0\u0102\6\60\6\25\6"+
    "\2\6\6\6\3\0\12\6\246\0\57\4\1\0\57\4\1\0\205\4"+
    "\6\6\4\4\3\20\16\0\46\4\12\0\66\4\11\0\1\4\17\0"+
    "\1\20\27\4\11\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4"+
    "\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\40\20"+
    "\57\0\1\4\120\0\32\6\1\0\131\6\14\0\326\6\32\0\14\6"+
    "\10\0\1\6\3\4\12\0\2\6\14\0\1\6\11\4\6\20\1\0"+
    "\5\4\2\6\5\4\1\0\2\6\1\0\126\4\2\0\2\20\2\0"+
    "\3\4\1\0\132\4\1\0\4\4\5\0\51\4\3\0\136\4\1\0"+
    "\2\6\4\0\12\6\33\4\5\0\44\6\14\0\20\4\37\6\13\0"+
    "\47\6\17\0\40\6\12\0\47\6\17\0\77\6\1\0\u0100\6\u19b6\4"+
    "\12\0\100\6\u51cc\4\64\0\u048d\4\3\0\67\6\11\0\56\4\2\0"+
    "\u010d\4\3\0\20\4\12\20\2\4\24\0\57\4\1\20\14\0\2\20"+
    "\1\0\31\4\10\0\120\4\2\20\45\0\11\4\2\0\147\4\2\0"+
    "\4\4\1\0\2\4\16\0\12\4\120\0\10\4\1\20\3\4\1\20"+
    "\4\4\1\20\27\4\5\20\4\6\12\0\2\6\1\4\1\6\6\0"+
    "\64\4\14\0\2\20\62\4\21\20\13\0\12\20\6\0\22\20\6\4"+
    "\3\0\1\4\4\0\12\20\34\4\10\20\2\0\27\4\15\20\14\0"+
    "\35\4\3\0\4\20\57\4\16\20\16\0\1\4\12\20\46\0\51\4"+
    "\16\20\11\0\3\4\1\20\10\4\2\20\2\0\12\20\6\0\27\4"+
    "\3\6\1\4\1\20\4\0\60\4\1\20\1\4\3\20\2\4\2\20"+
    "\5\4\2\20\1\4\1\20\1\4\30\0\3\4\43\0\6\4\2\0"+
    "\6\4\2\0\6\4\11\0\7\4\1\0\7\4\221\0\43\4\10\20"+
    "\1\0\2\20\2\0\12\20\6\0\u2ba4\4\14\0\27\4\4\0\61\4"+
    "\u2104\0\u012e\4\2\0\76\4\2\0\152\4\46\0\7\4\14\0\5\4"+
    "\5\0\1\4\1\20\12\4\1\6\15\4\1\0\5\4\1\0\1\4"+
    "\1\0\2\4\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0\100\4"+
    "\2\0\66\4\50\0\15\4\1\6\2\0\20\20\20\0\7\20\14\0"+
    "\2\4\30\0\3\4\22\0\1\6\1\0\3\6\2\0\1\4\6\0"+
    "\5\4\1\0\207\4\2\0\1\20\4\0\1\4\6\0\1\6\4\0"+
    "\12\20\2\0\3\6\2\0\32\4\4\0\1\4\1\0\32\4\1\0"+
    "\1\6\1\0\1\6\7\0\131\4\3\0\6\4\2\0\6\4\2\0"+
    "\6\4\2\0\3\4\3\0\2\4\1\6\1\0\1\6\2\4\1\0"+
    "\1\6\4\6\2\6\12\0\3\20\2\6\2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\23\0\3\1\1\2\1\3\1\2\1\4\1\2\1\5"+
    "\4\2\1\6\3\2\1\7\1\10\1\11\1\1\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\2\21\1\1"+
    "\1\22\1\23\1\22\1\1\1\24\1\1\1\7\1\25"+
    "\1\26\2\27\2\1\1\30\2\31\2\32\1\0\1\33"+
    "\1\0\1\34\1\35\1\36\1\37\2\0\1\40\1\41"+
    "\3\42\1\21\2\0\1\21\1\43\1\22\2\0\1\22"+
    "\1\44\1\27\3\0\1\27\1\0\1\45\1\46\1\0"+
    "\1\47\1\50\2\42\1\21\1\22\1\51\1\27\1\52"+
    "\2\0\2\42\2\43\3\0\2\42\1\51\1\53\1\0"+
    "\1\42\1\54\1\55\1\0\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[129];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\u0297\0\u02be\0\u02be\0\u02e5\0\u030c\0\u02be\0\u0333"+
    "\0\u02e5\0\u02be\0\u035a\0\u02be\0\u0381\0\u03a8\0\u03cf\0\u03f6"+
    "\0\u041d\0\u0444\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u03cf"+
    "\0\u052e\0\u0555\0\u057c\0\u05a3\0\u02be\0\u02be\0\u02be\0\u05ca"+
    "\0\u05f1\0\u0618\0\u063f\0\u02be\0\u0666\0\u068d\0\u02be\0\u06b4"+
    "\0\u06db\0\u02be\0\u0702\0\u0729\0\u0750\0\u0777\0\u046b\0\u079e"+
    "\0\u02be\0\u02e5\0\u02be\0\u07c5\0\u02e5\0\u02be\0\u07ec\0\u02be"+
    "\0\u0813\0\u02be\0\u083a\0\u0861\0\u0888\0\u08af\0\u02be\0\u08d6"+
    "\0\u08fd\0\u0924\0\u094b\0\u0618\0\u0972\0\u02be\0\u02be\0\u0999"+
    "\0\u068d\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\u0a5c\0\u0777\0\u0a83"+
    "\0\u0aaa\0\u0ad1\0\u02be\0\u0af8\0\u0b1f\0\u02be\0\u0b46\0\u0b6d"+
    "\0\u0b94\0\u0618\0\u0bbb\0\u02be\0\u0be2\0\u02be\0\u0c09\0\u0c30"+
    "\0\u0c57\0\u0c7e\0\u068d\0\u0777\0\u0ca5\0\u0ccc\0\u0cf3\0\u0d1a"+
    "\0\u0d41\0\u0777\0\u02be\0\u0d68\0\u0d8f\0\u08d6\0\u02be\0\u0db6"+
    "\0\u08d6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[129];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\10\24\1\25\4\24\1\26\31\24\1\27\2\30\5\27"+
    "\1\31\1\27\1\32\6\27\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\5\27\1\43\2\27\1\44"+
    "\6\27\1\30\1\45\5\27\1\31\1\27\1\32\6\27"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\46\1\42"+
    "\5\27\1\43\10\27\1\24\2\47\5\24\1\25\14\24"+
    "\1\50\22\24\1\51\1\52\5\24\1\25\37\24\1\51"+
    "\1\53\5\24\1\25\46\24\1\25\36\24\1\27\2\51"+
    "\3\54\1\27\1\55\1\31\10\27\1\54\2\27\1\56"+
    "\1\54\2\27\1\54\1\27\5\54\1\57\2\27\5\54"+
    "\4\24\1\60\1\24\10\61\3\24\1\60\1\62\4\24"+
    "\1\61\1\60\1\24\4\60\3\24\1\61\5\60\4\24"+
    "\1\63\1\64\10\65\3\24\1\63\1\66\4\24\1\65"+
    "\1\63\1\24\4\63\3\24\1\65\5\63\1\24\2\30"+
    "\3\54\2\24\1\25\10\24\1\54\2\24\1\56\1\54"+
    "\2\24\1\54\1\24\5\54\1\24\1\67\1\24\5\54"+
    "\10\24\1\25\30\24\1\70\5\24\31\71\1\72\15\71"+
    "\1\24\2\73\5\24\1\25\20\24\1\72\21\24\1\74"+
    "\1\64\10\75\3\24\1\74\1\76\4\24\1\75\1\74"+
    "\1\24\4\74\1\77\2\24\1\75\5\74\1\24\1\100"+
    "\6\24\1\25\25\24\1\77\10\24\1\101\2\51\5\101"+
    "\1\102\36\101\1\103\1\30\27\103\1\104\15\103\57\0"+
    "\1\105\4\0\1\106\41\0\1\107\37\0\2\30\65\0"+
    "\1\110\50\0\1\111\47\0\1\112\47\0\1\113\47\0"+
    "\1\114\12\0\1\115\34\0\1\41\23\0\1\116\14\0"+
    "\1\116\6\0\1\116\1\0\4\116\4\0\5\116\36\0"+
    "\1\117\14\0\1\120\14\0\1\120\6\0\1\120\1\0"+
    "\1\120\1\121\1\122\1\120\4\0\5\120\2\0\1\45"+
    "\73\0\1\46\20\0\2\47\45\0\2\51\45\0\1\51"+
    "\1\52\45\0\1\51\1\53\47\0\3\54\13\0\1\54"+
    "\3\0\1\54\2\0\1\54\1\0\5\54\3\0\5\54"+
    "\3\0\2\60\11\0\1\60\1\0\1\60\1\123\6\0"+
    "\1\60\1\0\4\60\4\0\5\60\6\0\10\61\11\0"+
    "\1\61\11\0\1\61\5\0\1\124\1\0\12\124\1\125"+
    "\1\124\2\0\2\124\1\126\24\124\3\0\2\63\1\127"+
    "\10\0\1\63\1\0\1\63\1\130\6\0\1\63\1\0"+
    "\4\63\4\0\5\63\5\0\1\127\10\65\11\0\1\65"+
    "\11\0\1\65\5\0\1\131\1\0\12\131\1\132\1\131"+
    "\2\0\2\131\1\133\24\131\4\0\1\134\14\0\1\134"+
    "\6\0\1\134\1\0\4\134\4\0\5\134\31\71\1\0"+
    "\15\71\1\0\2\73\47\0\2\74\1\127\10\0\1\74"+
    "\1\0\1\74\1\135\6\0\1\74\1\0\4\74\1\136"+
    "\3\0\5\74\5\0\1\127\10\75\11\0\1\75\6\0"+
    "\1\136\2\0\1\75\5\0\1\137\1\0\12\137\1\140"+
    "\1\137\2\0\2\137\1\141\24\137\1\0\2\100\75\0"+
    "\1\142\25\0\1\143\61\0\1\144\55\0\1\145\42\0"+
    "\1\146\24\0\1\147\14\0\1\147\6\0\1\147\1\0"+
    "\4\147\4\0\5\147\3\0\3\116\3\0\1\116\1\0"+
    "\1\116\5\0\1\116\6\0\1\116\1\0\4\116\4\0"+
    "\5\116\3\0\3\120\3\0\1\120\1\0\1\120\5\0"+
    "\1\120\6\0\1\120\1\0\4\120\4\0\5\120\3\0"+
    "\3\120\3\0\1\120\1\0\1\120\5\0\1\120\6\0"+
    "\1\120\1\0\1\150\1\120\1\122\1\120\4\0\5\120"+
    "\3\0\3\120\3\0\1\120\1\0\1\120\5\0\1\120"+
    "\6\0\1\120\1\0\4\120\4\0\3\120\1\151\1\120"+
    "\3\0\2\60\1\0\10\61\1\60\1\0\1\60\1\123"+
    "\5\0\1\61\1\60\1\0\4\60\3\0\1\61\5\60"+
    "\1\124\1\0\12\124\1\125\5\124\1\152\24\124\3\0"+
    "\2\63\1\127\10\65\1\63\1\0\1\63\1\130\5\0"+
    "\1\65\1\63\1\0\4\63\3\0\1\65\5\63\1\131"+
    "\1\0\12\131\1\132\5\131\1\153\24\131\5\0\1\127"+
    "\44\0\3\134\3\0\1\134\1\0\1\134\5\0\1\134"+
    "\6\0\1\134\1\0\4\134\4\0\5\134\3\0\2\74"+
    "\1\127\10\75\1\74\1\0\1\74\1\135\5\0\1\75"+
    "\1\74\1\0\4\74\1\136\2\0\1\75\5\74\36\0"+
    "\1\154\10\0\1\137\1\0\12\137\1\140\5\137\1\155"+
    "\24\137\5\0\1\127\30\0\1\136\41\0\1\156\40\0"+
    "\1\157\56\0\1\160\16\0\3\147\3\0\1\147\1\0"+
    "\1\147\5\0\1\147\6\0\1\147\1\0\4\147\4\0"+
    "\5\147\3\0\3\120\3\0\1\120\1\0\1\120\5\0"+
    "\1\120\6\0\1\120\1\0\4\120\4\0\1\161\4\120"+
    "\3\0\3\120\3\0\1\120\1\0\1\120\5\0\1\120"+
    "\6\0\1\120\1\0\4\120\4\0\1\162\4\120\1\131"+
    "\1\0\3\131\1\163\6\131\1\132\1\131\2\0\2\131"+
    "\1\133\24\131\1\137\1\0\3\137\1\164\6\137\1\140"+
    "\1\137\2\0\2\137\1\141\13\137\1\165\10\137\23\0"+
    "\1\166\56\0\1\167\16\0\3\120\3\0\1\120\1\0"+
    "\1\120\5\0\1\120\6\0\1\120\1\0\4\120\4\0"+
    "\1\120\1\170\3\120\3\0\3\120\3\0\1\120\1\0"+
    "\1\120\5\0\1\120\6\0\1\120\1\0\4\120\4\0"+
    "\3\120\1\171\1\120\1\137\1\0\12\137\1\140\1\137"+
    "\2\0\2\137\1\141\13\137\1\172\10\137\23\173\1\0"+
    "\23\173\34\0\1\174\15\0\3\120\3\0\1\120\1\0"+
    "\1\120\5\0\1\120\6\0\1\120\1\0\4\120\4\0"+
    "\2\120\1\175\2\120\3\0\3\120\3\0\1\120\1\0"+
    "\1\120\5\0\1\120\6\0\1\120\1\0\4\120\4\0"+
    "\4\120\1\176\13\0\1\177\21\0\1\200\14\0\3\120"+
    "\3\0\1\120\1\0\1\120\5\0\1\120\6\0\1\120"+
    "\1\0\3\120\1\201\4\0\5\120\13\0\1\177\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3549];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\22\0\1\10\1\11\2\1\1\11\2\1\1\11\1\1"+
    "\1\11\20\1\3\11\4\1\1\11\2\1\1\11\2\1"+
    "\1\11\6\1\1\11\1\1\1\11\1\1\1\0\1\11"+
    "\1\0\1\11\1\1\1\11\1\1\2\0\1\1\1\11"+
    "\4\1\2\0\2\11\1\1\2\0\3\1\3\0\1\1"+
    "\1\0\1\11\1\1\1\0\1\11\5\1\1\11\1\1"+
    "\1\11\2\0\4\1\3\0\3\1\1\11\1\0\2\1"+
    "\1\11\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[129];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

  private boolean isOddItalicBold = false;;

  public _ScalaDocLexer() {
    this((java.io.Reader)null);
  }

  public boolean checkAhead(char c) {
     if (zzMarkedPos >= zzBuffer.length()) return false;
     return zzBuffer.charAt(zzMarkedPos) == c;
  }

  public void goTo(int offset) {
    zzCurrentPos = zzMarkedPos = zzStartRead = offset;
    zzPushbackPos = 0;
    zzAtEOF = offset < zzEndRead;
  }



  public _ScalaDocLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _ScalaDocLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2554) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 28: 
          { return DOC_UNDERLINE_TAG;
          }
        case 47: break;
        case 17: 
          { yybegin(DOC_TAG_VALUE_SPACE); return DOC_TAG_VALUE_TOKEN;
          }
        case 48: break;
        case 1: 
          { return DOC_COMMENT_BAD_CHARACTER;
          }
        case 49: break;
        case 39: 
          { yybegin(COMMENT_INNER_CODE);
  return DOC_INNER_CODE_TAG;
          }
        case 50: break;
        case 11: 
          { yybegin(PARAM_DOC_TAG_VALUE); return DOC_COMMENT_DATA;
          }
        case 51: break;
        case 19: 
          { return tDOT;
          }
        case 52: break;
        case 7: 
          { return DOC_COMMENT_DATA;
          }
        case 53: break;
        case 29: 
          { return DOC_ITALIC_TAG;
          }
        case 54: break;
        case 12: 
          { yybegin(PARAM_DOC_THROWS_TAG_VALUE); return DOC_COMMENT_DATA;
          }
        case 55: break;
        case 36: 
          { yybegin(INLINE_TAG_DOC_SPACE); return DOC_TAG_NAME;
          }
        case 56: break;
        case 23: 
          { yybegin(CODE_BAD_LINK);
  return tIDENTIFIER;
          }
        case 57: break;
        case 33: 
          { yybegin(COMMENT_DATA);
  return DOC_LINK_CLOSE_TAG;
          }
        case 58: break;
        case 32: 
          { return DOC_MACROS;
          }
        case 59: break;
        case 13: 
          { return DOC_TAG_VALUE_TOKEN;
          }
        case 60: break;
        case 27: 
          { return DOC_COMMENT_END;
          }
        case 61: break;
        case 42: 
          { yybegin(COMMENT_DATA);
  return DOC_INNER_CLOSE_CODE_TAG;
          }
        case 62: break;
        case 14: 
          { return DOC_TAG_VALUE_SHARP_TOKEN;
          }
        case 63: break;
        case 18: 
          { yybegin(DOC_TAG_VALUE_SPACE);
  return tIDENTIFIER;
          }
        case 64: break;
        case 25: 
          { yybegin(COMMENT_DATA); return DOC_COMMENT_DATA;
          }
        case 65: break;
        case 6: 
          { return VALID_DOC_HEADER;
          }
        case 66: break;
        case 37: 
          { yybegin(COMMENT_DATA_START); return DOC_COMMENT_START;
          }
        case 67: break;
        case 46: 
          { yybegin(PARAM_THROWS_TAG_DOC_SPACE); return DOC_TAG_NAME;
          }
        case 68: break;
        case 41: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { return tIDENTIFIER;
          }
        case 69: break;
        case 35: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return tIDENTIFIER;
          }
        case 70: break;
        case 26: 
          { yybegin(COMMENT_INNER_CODE);
  return DOC_INNER_CODE;
          }
        case 71: break;
        case 24: 
          { yybegin(COMMENT_DATA);
  return DOC_WHITESPACE;
          }
        case 72: break;
        case 8: 
          { return DOC_HEADER;
          }
        case 73: break;
        case 30: 
          { return DOC_SUBSCRIPT_TAG;
          }
        case 74: break;
        case 16: 
          { yybegin(DOC_TAG_VALUE_IN_PAREN); return DOC_TAG_VALUE_LPAREN;
          }
        case 75: break;
        case 40: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { yybegin(INLINE_TAG_NAME);
  return DOC_INLINE_TAG_START;
          }
        case 76: break;
        case 15: 
          { return DOC_TAG_VALUE_COMMA;
          }
        case 77: break;
        case 38: 
          { return DOC_BOLD_TAG;
          }
        case 78: break;
        case 34: 
          { yybegin(TAG_DOC_SPACE); return DOC_TAG_NAME;
          }
        case 79: break;
        case 9: 
          { yybegin(COMMENT_DATA);
   return DOC_WHITESPACE;
          }
        case 80: break;
        case 44: 
          { yybegin(PARAM_TAG_DOC_SPACE); return DOC_TAG_NAME;
          }
        case 81: break;
        case 10: 
          { yybegin(COMMENT_DATA); return DOC_WHITESPACE;
          }
        case 82: break;
        case 31: 
          { yybegin(CODE_LINK_INNER);
  return DOC_LINK_TAG;
          }
        case 83: break;
        case 43: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 3;
          { if (isOddItalicBold) {
    isOddItalicBold = false;
    yypushback(1);
    return DOC_ITALIC_TAG;
  }
  isOddItalicBold = true;
  return DOC_BOLD_TAG;
          }
        case 84: break;
        case 22: 
          { yybegin(INLINE_DOC_TAG_VALUE);
  return DOC_WHITESPACE;
          }
        case 85: break;
        case 21: 
          { yybegin(COMMENT_DATA); return DOC_INLINE_TAG_END;
          }
        case 86: break;
        case 4: 
          { return DOC_SUPERSCRIPT_TAG;
          }
        case 87: break;
        case 3: 
          { return DOC_WHITESPACE;
          }
        case 88: break;
        case 5: 
          { return DOC_MONOSPACE_TAG;
          }
        case 89: break;
        case 20: 
          { yybegin(DOC_TAG_VALUE); return DOC_TAG_VALUE_RPAREN;
          }
        case 90: break;
        case 45: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 2;
          { yybegin(COMMENT_DATA);
  return DOC_HTTP_LINK_TAG;
          }
        case 91: break;
        case 2: 
          { yybegin(COMMENT_DATA);
  return DOC_COMMENT_DATA;
          }
        case 92: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
