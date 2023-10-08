// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _XIMStringConversionCallbackStruct {
 *     XIMStringConversionPosition position;
 *     XIMCaretDirection direction;
 *     XIMStringConversionOperation operation;
 *     unsigned short factor;
 *     XIMStringConversionText* text;
 * };
 * }
 */
public class _XIMStringConversionCallbackStruct {

    public static MemoryLayout $LAYOUT() {
        return constants$118.const$1;
    }
    public static VarHandle position$VH() {
        return constants$118.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XIMStringConversionPosition position;
     * }
     */
    public static short position$get(MemorySegment seg) {
        return (short)constants$118.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XIMStringConversionPosition position;
     * }
     */
    public static void position$set(MemorySegment seg, short x) {
        constants$118.const$2.set(seg, x);
    }
    public static short position$get(MemorySegment seg, long index) {
        return (short)constants$118.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void position$set(MemorySegment seg, long index, short x) {
        constants$118.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle direction$VH() {
        return constants$118.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XIMCaretDirection direction;
     * }
     */
    public static int direction$get(MemorySegment seg) {
        return (int)constants$118.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XIMCaretDirection direction;
     * }
     */
    public static void direction$set(MemorySegment seg, int x) {
        constants$118.const$3.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)constants$118.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        constants$118.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle operation$VH() {
        return constants$118.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XIMStringConversionOperation operation;
     * }
     */
    public static short operation$get(MemorySegment seg) {
        return (short)constants$118.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XIMStringConversionOperation operation;
     * }
     */
    public static void operation$set(MemorySegment seg, short x) {
        constants$118.const$4.set(seg, x);
    }
    public static short operation$get(MemorySegment seg, long index) {
        return (short)constants$118.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void operation$set(MemorySegment seg, long index, short x) {
        constants$118.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle factor$VH() {
        return constants$118.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short factor;
     * }
     */
    public static short factor$get(MemorySegment seg) {
        return (short)constants$118.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short factor;
     * }
     */
    public static void factor$set(MemorySegment seg, short x) {
        constants$118.const$5.set(seg, x);
    }
    public static short factor$get(MemorySegment seg, long index) {
        return (short)constants$118.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void factor$set(MemorySegment seg, long index, short x) {
        constants$118.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text$VH() {
        return constants$119.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XIMStringConversionText* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$119.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XIMStringConversionText* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        constants$119.const$0.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$119.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$119.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


