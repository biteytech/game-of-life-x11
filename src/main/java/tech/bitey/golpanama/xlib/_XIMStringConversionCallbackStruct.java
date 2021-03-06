// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _XIMStringConversionCallbackStruct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("position"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_INT$LAYOUT.withName("direction"),
        Constants$root.C_SHORT$LAYOUT.withName("operation"),
        Constants$root.C_SHORT$LAYOUT.withName("factor"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("text")
    ).withName("_XIMStringConversionCallbackStruct");
    public static MemoryLayout $LAYOUT() {
        return _XIMStringConversionCallbackStruct.$struct$LAYOUT;
    }
    static final VarHandle position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("position"));
    public static VarHandle position$VH() {
        return _XIMStringConversionCallbackStruct.position$VH;
    }
    public static short position$get(MemorySegment seg) {
        return (short)_XIMStringConversionCallbackStruct.position$VH.get(seg);
    }
    public static void position$set( MemorySegment seg, short x) {
        _XIMStringConversionCallbackStruct.position$VH.set(seg, x);
    }
    public static short position$get(MemorySegment seg, long index) {
        return (short)_XIMStringConversionCallbackStruct.position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void position$set(MemorySegment seg, long index, short x) {
        _XIMStringConversionCallbackStruct.position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle direction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("direction"));
    public static VarHandle direction$VH() {
        return _XIMStringConversionCallbackStruct.direction$VH;
    }
    public static int direction$get(MemorySegment seg) {
        return (int)_XIMStringConversionCallbackStruct.direction$VH.get(seg);
    }
    public static void direction$set( MemorySegment seg, int x) {
        _XIMStringConversionCallbackStruct.direction$VH.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)_XIMStringConversionCallbackStruct.direction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        _XIMStringConversionCallbackStruct.direction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle operation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("operation"));
    public static VarHandle operation$VH() {
        return _XIMStringConversionCallbackStruct.operation$VH;
    }
    public static short operation$get(MemorySegment seg) {
        return (short)_XIMStringConversionCallbackStruct.operation$VH.get(seg);
    }
    public static void operation$set( MemorySegment seg, short x) {
        _XIMStringConversionCallbackStruct.operation$VH.set(seg, x);
    }
    public static short operation$get(MemorySegment seg, long index) {
        return (short)_XIMStringConversionCallbackStruct.operation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void operation$set(MemorySegment seg, long index, short x) {
        _XIMStringConversionCallbackStruct.operation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle factor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("factor"));
    public static VarHandle factor$VH() {
        return _XIMStringConversionCallbackStruct.factor$VH;
    }
    public static short factor$get(MemorySegment seg) {
        return (short)_XIMStringConversionCallbackStruct.factor$VH.get(seg);
    }
    public static void factor$set( MemorySegment seg, short x) {
        _XIMStringConversionCallbackStruct.factor$VH.set(seg, x);
    }
    public static short factor$get(MemorySegment seg, long index) {
        return (short)_XIMStringConversionCallbackStruct.factor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void factor$set(MemorySegment seg, long index, short x) {
        _XIMStringConversionCallbackStruct.factor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("text"));
    public static VarHandle text$VH() {
        return _XIMStringConversionCallbackStruct.text$VH;
    }
    public static MemoryAddress text$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMStringConversionCallbackStruct.text$VH.get(seg);
    }
    public static void text$set( MemorySegment seg, MemoryAddress x) {
        _XIMStringConversionCallbackStruct.text$VH.set(seg, x);
    }
    public static MemoryAddress text$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_XIMStringConversionCallbackStruct.text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemoryAddress x) {
        _XIMStringConversionCallbackStruct.text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


